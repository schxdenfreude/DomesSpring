<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="fr">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="css/header.css">
    <link rel="stylesheet" href="css/form.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css"
        integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://getbootstrap.com/docs/5.2/assets/css/docs.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <script src="script/index.js" defer></script>
</head>

<body>
     <jsp:include page="components/header.jsp" />

    <main class="m-auto w-75 mt-5 container d-grid formul ">
        <form:form class="w-100 m-auto text-dark bg-white px-5 d-flex justify-content-center login" action ="/loginUser" method = "post" modelAttribute="user">
            <div class="w-75 formm">
            <!-- Email input -->
            <h2 class="text-center">Connectez vous!</h2>
            <div class="form-outline mb-4 mt-auto">
              <form:input type="text" id="form2Example1" class="form-control" path="loginUser"/>
              <label class="form-label" for="form2Example1">Username</label>
            </div>
          
            <!-- Password input -->
            <div class="form-outline mb-4">
              <form:input type="password" id="form2Example2" class="form-control" path="passwordUser"/>
              <label class="form-label" for="form2Example2">Password</label>
            </div>
          
            <!-- 2 column grid layout for inline styling -->
            <div class="row mb-4">
              <div class="col d-flex justify-content-center">
                <!-- Checkbox -->
                <div class="form-check">
                  <input class="form-check-input" type="checkbox" value="" id="form2Example31" checked />
                  <label class="form-check-label" for="form2Example31"> Remember me </label>
                </div>
              </div>
          
              <div class="col">
                <!-- Simple link -->
                <a href="#!">Forgot password?</a>
              </div>
            </div>
          
            <!-- Submit button -->
            <input type="submit"></input>
            </form:form>

            <!-- Register buttons -->
            <div class="text-center">
              <p>Not a member? <a href="#!">Register</a></p>
              <p>or sign up with:</p>
              <button type="button" class="btn btn-link btn-floating mx-1">
                <i class="fab fa-facebook-f"></i>
              </button>
          
              <button type="button" class="btn btn-link btn-floating mx-1">
                <i class="fab fa-google"></i>
              </button>
          
              <button type="button" class="btn btn-link btn-floating mx-1">
                <i class="fab fa-twitter"></i>
              </button>
          
              <button type="button" class="btn btn-link btn-floating mx-1">
                <i class="fab fa-github"></i>
              </button>
            </div>
        </div>


          <div class="inscript text-center d-block">
            <div class="w-75 m-auto mt-4 align-items-center text-white">
                <h2>Pas de compte? inscrivez vous!</h2>
                <br> 
                <p>Entrez vos informations personnelles et rejoignez nous dans notre aventure!</p>
                <button type="button" class="btn btn-primary">Inscrivez vous</button>
            </div>
          </div>
    </main>
</body>

</html>