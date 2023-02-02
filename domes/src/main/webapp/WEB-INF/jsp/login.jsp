<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="fr">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="../asset/css/connexion.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css"
        integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://getbootstrap.com/docs/5.2/assets/css/docs.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <script src="index.js" defer></script>
</head>

<body>
    <div class="header-height"></div>
   


    
    <main class="m-auto w-75 mt-5 container d-grid formul ">
        <form:form class="w-100 m-auto text-dark bg-white px-5 d-flex justify-content-center login" action ="/loginUser" method = "post" modelAttribute="user">
            <div class="w-75 formm">
            <!-- Email input -->
            <h2 class="text-center">Connectez vous!</h2>
            <div class="form-outline mb-4 mt-auto">
              <form:input id="form2Example1" class="form-control" path="loginUser"/>
              <label class="form-label">Adresse Mail</label>
            </div>
          
            <!-- Password input -->
            <div class="form-outline mb-4">
              <form:input type="password" id="form2Example2" class="form-control" path="passwordUser"/>
              <label class="form-label">Mot de passe</label>
            </div>
          
              <div class="col">
                <!-- Simple link -->
                <a href="#!">Mot de passe oublié ?</a>
              </div>
            </div>
          
            <!-- Submit button -->
            <input type="submit" class="btn btn-primary btn-block mb-4" value = "Se connecter">
          
            <!-- Register buttons -->
            <div class="text-center">
         
              <p>Ou Connectez vous avec :</p>
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
        </form:form>


          <div class="inscript text-center d-flex">
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