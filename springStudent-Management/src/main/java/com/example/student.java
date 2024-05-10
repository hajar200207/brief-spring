package com.example;

public class student {

        private int id;
        private String name;
        private String registrationNumber;
       
		private String email;

    public student() {
    }

    public student(int id, String name, String registrationNumber, String email) {
        this.id = id;
        this.name = name;
        this.registrationNumber=registrationNumber;
        this.email = email;
    }

    public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


        public int getId(){ return id ;}

        public void setId(int id) {
            this.id = id;
        }
        /**
		 * @return the registrationNumber
		 */
		public String getRegistrationNumber() {
			return registrationNumber;
		}

		/**
		 * @param registrationNumber the registrationNumber to set
		 */
		public void setRegistrationNumber(String registrationNumber) {
			this.registrationNumber = registrationNumber;
		}

      
        @Override
		public String toString() {
			return "student [id=" + id + ", name=" + name + ", registrationNumber=" + registrationNumber + ", email="
					+ email + "]";
		}

		public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }


}


