<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        .c1
        {
           
            width: 50%;
        }
    </style>
</head>
<body>
    <div class="container-fluid">
     <center>
     <h1>Student Profile</h1>
        <div class="c1">
          
                <table class="table table-striped table-dark mt-5">
                    <tbody >
                        <tr>
                     
                          <td>Name</td>
                          <td>${student.name}</td>
                        </tr>
                        <tr>
                          
                            <td>Roll Number</td>
                            <td>${student.rollno}</td>
                          </tr>
                          <tr>
                           
                            <td>Branch</td>
                            <td>${student.branch}</td>
                          </tr>
                      </tbody>
                </table>
           
            
        </div>
    </center>
    </div>
   
</body>
</html>