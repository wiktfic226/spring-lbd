package pl.fis.springlbdday2.dto.currency;

import java.util.List;

public class RatesDto {
    private String table;
    private String no;
    private String effectiveDate;
    private CurrencyDto[] rates;

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public CurrencyDto[] getRates() {
        return rates;
    }

    public void setRates(CurrencyDto[] rates) {
        this.rates = rates;
    }
}
