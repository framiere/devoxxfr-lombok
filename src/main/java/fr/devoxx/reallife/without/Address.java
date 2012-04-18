package fr.devoxx.reallife.without;

public class Address {
    private String street;
    private String twon;
    private String city;
    private String zipCode;

    public Address(String street, String twon, String city, String zipCode) {
        this.street = street;
        this.twon = twon;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTwon() {
        return twon;
    }

    public void setTwon(String twon) {
        this.twon = twon;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((city == null) ? 0 : city.hashCode());
        result = prime * result + ((street == null) ? 0 : street.hashCode());
        result = prime * result + ((twon == null) ? 0 : twon.hashCode());
        result = prime * result + ((zipCode == null) ? 0 : zipCode.hashCode());
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
        Address other = (Address) obj;
        if (city == null) {
            if (other.city != null)
                return false;
        } else if (!city.equals(other.city))
            return false;
        if (street == null) {
            if (other.street != null)
                return false;
        } else if (!street.equals(other.street))
            return false;
        if (twon == null) {
            if (other.twon != null)
                return false;
        } else if (!twon.equals(other.twon))
            return false;
        if (zipCode == null) {
            if (other.zipCode != null)
                return false;
        } else if (!zipCode.equals(other.zipCode))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Address [street=" + street + ", twon=" + twon + ", city=" + city + ", zipCode=" + zipCode + "]";
    }

    public static class Builder {
        private String street;
        private String twon;
        private String city;
        private String zipCode;

        public Builder street(String street) {
            this.street = street;
            return this;
        }

        public Builder twon(String twon) {
            this.twon = twon;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder zipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }

    private Address(Builder builder) {
        this.street = builder.street;
        this.twon = builder.twon;
        this.city = builder.city;
        this.zipCode = builder.zipCode;
    }
}
