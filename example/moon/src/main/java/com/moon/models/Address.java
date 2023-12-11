package com.moon.models;


public record Address(String street, String city, String zipCode, String country, String supplement) {

    public static class Builder {
        private String street;
        private String city;
        private String zipCode;
        private String country;
        private String supplement;

        public Builder() {}

        public Builder street(String street) {
            this.street = street;
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

        public Builder country(String country) {
            this.country = country;
            return this;
        }

        public Builder supplement(String supplement) {
            this.supplement = supplement;
            return this;
        }

        public Address build() {

            return new Address(
                this.street,
                this.city,
                this.zipCode,
                this.country,
                this.supplement
            );
        }

    }
}
