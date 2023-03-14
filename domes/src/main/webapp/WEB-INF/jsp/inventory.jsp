<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/index.css">
    <link rel="stylesheet" href="css/header.css">
    <link rel="stylesheet" href="css/footer.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/swiper@8/swiper-bundle.min.css" />
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <title>Document</title>
</head>

<body>
     <jsp:include page="components/header.jsp" />

                     <c:forEach var="liste" items="${ListeProduits}">

                             <div class="swiper-slide">
                                 <section class="slider--recommandation">


                                     <div class="slider--card">
                                         <div class="img--card " style="background-image: url('images/index/${liste.getImagePath()}'); "></div>
                                         <div class="desc--card">
                                             <h2 class="title">${liste.getProductName()}<span class="value--price">1500e</span></h2>
                                             <p class="age">description : <span class="value--age">${liste.getProductDescription()}</span></p>
                                             <p class="color">Couleur : <span class="value--color">Tigré</span></p>
                                             <p class="character">Caractère : <span class="value--character"></span></p>
                                         </div>
                                     </div>


                                 </section>
                             </div>

                     </c:forEach>






</body>

</html>