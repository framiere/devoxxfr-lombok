package fr.devoxx.reallife.without;

import java.util.Date;

public class Trade {
    private Account from;
    private Account to;
    private float price;
    private Date date;
    private Date limit;
    private TradeType type;
    private Insurance insurance;
    private InsurancePolicy insurancePolicy;

    public Trade(Account from, Account to, float price, Date date, Date limit, TradeType type, Insurance insurance, InsurancePolicy insurancePolicy) {
        this.from = from;
        this.to = to;
        this.price = price;
        this.date = date;
        this.limit = limit;
        this.type = type;
        this.insurance = insurance;
        this.insurancePolicy = insurancePolicy;
    }

    public Account getFrom() {
        return from;
    }

    public void setFrom(Account from) {
        this.from = from;
    }

    public Account getTo() {
        return to;
    }

    public void setTo(Account to) {
        this.to = to;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getLimit() {
        return limit;
    }

    public void setLimit(Date limit) {
        this.limit = limit;
    }

    public TradeType getType() {
        return type;
    }

    public void setType(TradeType type) {
        this.type = type;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public InsurancePolicy getInsurancePolicy() {
        return insurancePolicy;
    }

    public void setInsurancePolicy(InsurancePolicy insurancePolicy) {
        this.insurancePolicy = insurancePolicy;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        result = prime * result + ((from == null) ? 0 : from.hashCode());
        result = prime * result + ((insurance == null) ? 0 : insurance.hashCode());
        result = prime * result + ((insurancePolicy == null) ? 0 : insurancePolicy.hashCode());
        result = prime * result + ((limit == null) ? 0 : limit.hashCode());
        result = prime * result + Float.floatToIntBits(price);
        result = prime * result + ((to == null) ? 0 : to.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Trade other = (Trade) obj;
        if (date == null) {
            if (other.date != null)
                return false;
        } else if (!date.equals(other.date))
            return false;
        if (from == null) {
            if (other.from != null)
                return false;
        } else if (!from.equals(other.from))
            return false;
        if (insurance == null) {
            if (other.insurance != null)
                return false;
        } else if (!insurance.equals(other.insurance))
            return false;
        if (insurancePolicy != other.insurancePolicy)
            return false;
        if (limit == null) {
            if (other.limit != null)
                return false;
        } else if (!limit.equals(other.limit))
            return false;
        if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
            return false;
        if (to == null) {
            if (other.to != null)
                return false;
        } else if (!to.equals(other.to))
            return false;
        if (type != other.type)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Trade [from=" + from + ", to=" + to + ", price=" + price + ", date=" + date + ", limit=" + limit + ", type=" + type + ", insurance="
                + insurance + ", insurancePolicy=" + insurancePolicy + "]";
    }

    public static class Builder {
        private Account from;
        private Account to;
        private float price;
        private Date date;
        private Date limit;
        private TradeType type;
        private Insurance insurance;
        private InsurancePolicy insurancePolicy;

        public Builder from(Account from) {
            this.from = from;
            return this;
        }

        public Builder to(Account to) {
            this.to = to;
            return this;
        }

        public Builder price(float price) {
            this.price = price;
            return this;
        }

        public Builder date(Date date) {
            this.date = date;
            return this;
        }

        public Builder limit(Date limit) {
            this.limit = limit;
            return this;
        }

        public Builder type(TradeType type) {
            this.type = type;
            return this;
        }

        public Builder insurance(Insurance insurance) {
            this.insurance = insurance;
            return this;
        }

        public Builder insurancePolicy(InsurancePolicy insurancePolicy) {
            this.insurancePolicy = insurancePolicy;
            return this;
        }

        public Trade build() {
            return new Trade(this);
        }
    }

    private Trade(Builder builder) {
        this.from = builder.from;
        this.to = builder.to;
        this.price = builder.price;
        this.date = builder.date;
        this.limit = builder.limit;
        this.type = builder.type;
        this.insurance = builder.insurance;
        this.insurancePolicy = builder.insurancePolicy;
    }
}
