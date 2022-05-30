package practice;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Transaction {
    private String merchant, paymentId, date,transactionId,transactionTs,stage,method,methodCode,accountCode,serviceId,serviceCategory,accountType,creditDebitCode,currency,version,actionDate,entryDate,batchId,entity;
    private Integer decimal;
    private Long amount;
}
