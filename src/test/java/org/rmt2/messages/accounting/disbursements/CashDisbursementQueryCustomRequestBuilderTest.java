package org.rmt2.messages.accounting.disbursements;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.rmt2.constants.ApiHeaderNames;
import org.rmt2.constants.ApiTransactionCodes;
import org.rmt2.constants.MessagingConstants;
import org.rmt2.jaxb.AccountingTransactionRequest;
import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RelationalOperatorType;
import org.rmt2.jaxb.TransactionCriteriaGroup;
import org.rmt2.jaxb.XactBasicCriteriaType;
import org.rmt2.jaxb.XactCriteriaType;
import org.rmt2.jaxb.XactCustomCriteriaTargetType;
import org.rmt2.jaxb.XactCustomRelationalCriteriaType;
import org.rmt2.util.HeaderTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.xml.jaxb.JaxbUtil;

public class CashDisbursementQueryCustomRequestBuilderTest {

    private JaxbUtil jaxb;
    
    @Before
    public void setUp() throws Exception {
        try {
            jaxb = SystemConfigurator.getJaxb(ConfigConstants.JAXB_CONTEXNAME_DEFAULT);
        }
        catch (Exception e) {
            jaxb = new JaxbUtil(MessagingConstants.JAXB_RMT2_PKG);
        }
    }
    
    @Test
    public void testBuildRequest() {
        ObjectFactory fact = new ObjectFactory();
        AccountingTransactionRequest req = fact.createAccountingTransactionRequest();
        
        HeaderType head =  HeaderTypeBuilder.Builder.create()
                .withApplication("accounting")
                .withModule("transaction")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.ACCOUNTING_CASHDISBURSE_GET)
                .withRouting(ApiTransactionCodes.ROUTE_ACCOUNTING)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        XactCriteriaType criteria = fact.createXactCriteriaType();
        criteria.setTargetLevel(XactCustomCriteriaTargetType.FULL);
        XactBasicCriteriaType xb = fact.createXactBasicCriteriaType();
        xb.setXactId(BigInteger.valueOf(34567));
        xb.setAccountNo("123-345-678");
        xb.setBusinessName("ABC Complay");
        xb.setXactDate("2018-12-01");
        xb.setInvoiceNo("1234566");
        xb.setConfirmNo("ADB-49384343");
        xb.setTenderId(BigInteger.valueOf(100));
        
        XactCustomRelationalCriteriaType xc = fact.createXactCustomRelationalCriteriaType();
        xc.setFromXactAmount(BigDecimal.valueOf(100.00));
        xc.setToXactAmount(BigDecimal.valueOf(200.00));
        xc.setFromRelOpXactAmount(RelationalOperatorType.GREATER_THAN_OR_EQUAL);
        xc.setToRelOpXactAmount(RelationalOperatorType.LESS_THAN_OR_EQUAL);
        
        criteria.setBasicCriteria(xb);
        criteria.setCustomCriteria(xc);
        
        TransactionCriteriaGroup criteriaGroup = fact.createTransactionCriteriaGroup();
        criteriaGroup.setXactCriteria(criteria);
        req.setCriteria(criteriaGroup);
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.ACCOUNTING_CASHDISBURSE_GET));
    }
  }
