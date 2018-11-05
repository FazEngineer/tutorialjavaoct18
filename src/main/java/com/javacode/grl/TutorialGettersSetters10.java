package com.javacode.grl;

public class TutorialGettersSetters10 {
        // access modifier
        // Encapsulation - Data hiding accessing data through getters and setters

        private String emailAddress;

        public String getEmailAddress(){
            return emailAddress;
        }

        public void setEmailAddress(String email){

            if(email.contains("@")){

                this.emailAddress = email;
            }else{

                throw new IllegalArgumentException(" Email address is invalid");
            }


        }



}
