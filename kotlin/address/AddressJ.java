package kotlin.address;

public class AddressJ {
    private String street;
    private String city;
    private String zipCode;
    private String country;
    private String supplement;


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

        public AddressJ build() {
            AddressJ addressJ = new AddressJ();
            addressJ.street = this.street;
            addressJ.city = this.city;
            addressJ.zipCode = this.zipCode;
            addressJ.country = this.country;
            addressJ.supplement = this.supplement;
            return addressJ;
        }
    }
}
