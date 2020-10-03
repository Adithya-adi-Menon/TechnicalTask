package com.example.task.Models;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customers {
        @Id
//        @OneToOne
//        @PrimaryKeyJoinColumn
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        @Column(name = "first_name", columnDefinition = "varchar(100)",nullable = false)
        private String first_name;

        @Column(name = "last_name", columnDefinition = "varchar(100)",nullable = false)
        private String last_name;

        @Column(name = "email", columnDefinition = "varchar(100)",nullable = false)
        private String email;

        @Column(name = "gender",columnDefinition = "varchar(100)" , nullable = false)
        private String gender;

        @Column(name = "mobiles")
        @ElementCollection
    private List<Long> mobiles = new ArrayList<>();

        public List<Long> getMobiles() {
            return mobiles;
        }

        public void setMobiles(List<Long> mobiles) {
            this.mobiles = mobiles;
        }


    public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }


    }

