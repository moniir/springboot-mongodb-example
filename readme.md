      create Database : employeedb
      
      After create db, rum application and sample postman request with 
      data provided below:-
      
      
      1. Add an Employee: 
           url : localhost:8088/api/addEmployee , Method: POST
       RequestBody:
           {
           	"name":"Akib Hassan",
           	"email": "akib@gmail.com",
           	"address": "House: 35, Main Road, Block: A, Badda,Dhaka",
           	"mobileNumber":"0173245344"
           }  
           
        Output:
            {
                "id": "629c7f17ac244813f314573f",
                "name": "Akib Hassan",
                "email": "akib@gmail.com",
                "address": "House: 35, Main Road, Block: A, Badda,Dhaka",
                "mobileNumber": "0173245344"
            }  
            
      2. Update Employee:
            url: localhost:8088/api/employee/629c7f17ac244813f314573f , Method: PUT
               Request Body:
                {
                	"id": "629c7f17ac244813f314573f",
                	"name":"Monir Hossain",
                	"email": "monir111@gmail.com",
                	"address": "House: 35, Main Road, Block: A, Aftabnagor",
                	"mobileNumber":"01712191676"
                }  
                
            Output:
                 {
                     "id": "629c7f17ac244813f314573f",
                     "name": "Monir Hossain",
                     "email": "monir111@gmail.com",
                     "address": "House: 35, Main Road, Block: A, Aftabnagor",
                     "mobileNumber": "01712191777"
                 }
                 
      3. Get Employee By Id:
            url: localhost:8088/api/employee/629c7f17ac244813f314573f
            
            Output: 
                {
                    "id": "629c7f17ac244813f314573f",
                    "name": "Monir Hossain",
                    "email": "monir111@gmail.com",
                    "address": "House: 35, Main Road, Block: A, Aftabnagor",
                    "mobileNumber": "01712191777"
                }
                
      4. Get All Employee:,
            url : localhost:8088/api/employees
            
        Output: 
            [
                {
                    "id": "629c7e1dac244813f314573d",
                    "name": "Monir Hossain Bhuiyan",
                    "email": "mhb@gmail.com",
                    "address": "House: 35, Main Road, Block: A, Aftabnagor",
                    "mobileNumber": "017111111"
                },
                {
                    "id": "629c7ef7ac244813f314573e",
                    "name": "Rakib Hossain",
                    "email": "rakib@gmail.com",
                    "address": "House: 35, Main Road, Block: A, Badda",
                    "mobileNumber": "017322344"
                },
                {
                    "id": "629c7f17ac244813f314573f",
                    "name": "Monir Hossain",
                    "email": "monir111@gmail.com",
                    "address": "House: 35, Main Road, Block: A, Aftabnagor",
                    "mobileNumber": "01712191777"
                }
            ]
      5. Delete By Id :
            url : localhost:8088/api/employee/629c7f17ac244813f314573f
            
                                          