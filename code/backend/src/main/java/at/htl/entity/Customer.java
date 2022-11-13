package at.htl.entity;

import javax.persistence.*;
import java.util.Date;

@NamedQueries({
        @NamedQuery(
                name = "Customer.findAll",
                query = "select c from Customer c"
        )
})
@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_ID")
    private Long id;

    @Column(name = "C_FIRSTNAME")
    private String firstName;

    @Column(name = "C_LASTNAME")
    private String lastName;

    @Column(name = "C_YEAR_OF_BIRTH")
    private Date yearOfBirth;

    @Column(name = "C_YEAR_OF_FUNERAL")
    private Date yearOfFuneral;

    public Customer() {
    }

    public Customer(String firstName, String lastName, Date yearOfBirth, Date yearOfFuneral) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.yearOfFuneral = yearOfFuneral;
    }

    //<editor-fold desc="getter&setter">
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Date getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Date yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Date getYearOfFuneral() {
        return yearOfFuneral;
    }

    public void setYearOfFuneral(Date yearOfFuneral) {
        this.yearOfFuneral = yearOfFuneral;
    }
    //</editor-fold>
}