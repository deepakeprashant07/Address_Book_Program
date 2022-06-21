public class PersonInformation {
    public String firstName, lastName, address, addressBook;
    public String city,state,zip, phoneNumber, emailId,key;

    @Override
    public String toString() {
        return "" +
                "\nFullName = " + firstName + ' ' +
                " " + lastName +
                ",\nAddress = " + address + ' ' +
                ", " + city +
                ",\nState = " + state + ' ' +
                " " + zip +
                "\nPhoneNumber = " + phoneNumber +
                "\n";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressBook() {
        return addressBook;
    }

    public void setAddressBook(String addressBook) {
        this.addressBook = addressBook;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
