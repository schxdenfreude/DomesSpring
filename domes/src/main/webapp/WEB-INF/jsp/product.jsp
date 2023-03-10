<!DOCTYPE html>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="i" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>${product.getProductName()}</title>
    <link rel="stylesheet" href="css/product.css" >
    <link rel="stylesheet" href="css/header.css">
    <link rel="stylesheet" href="css/footer.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
  <%@ include file="components/header.jsp" %>
  <main>
    <div class="container">
      <div class="grid second-nav">
        <div class="column-xs-12">
          <nav>
            <ol class="breadcrumb-list">
              <li class="breadcrumb-item"><a href="#">Accueil</a></li>
              <li class="breadcrumb-item"><a href="#">Produit</a></li>
              <li class="breadcrumb-item active">${product.getProductName()}</li>
            </ol>
          </nav>
        </div>
      </div>


      <c:if test="${!empty(product)}">
      <div class="grid product">

        <div class="column-xs-12 column-md-7">
          <div class="product-gallery">
            <div class="product-image">
              <img class="active" src="images/index/${product.getImagePath()}">
            </div>
            <ul class="image-list">

              <li class="image-item"><img src="images/index/${product.getImagePath()}"></li>
              <c:if test="${not empty product.imagePathTwo}">
                <li class="image-item"><img src="images/index/${product.getImagePathTwo()}"></li>
              </c:if>
              <c:if test="${not empty product.imagePathThree}">
                <li class="image-item"><img src="images/index/${product.getImagePathThree()}"></li>
              </c:if>
            </ul>
          </div>
        </div>

        <div class="column-xs-12 column-md-5">
        <form action="ajouter-produit/${product.idProduct}" method="post" class="form--product">
                <h1>${product.productName}</h1>
                <h2>${product.price}€</h2>
                <div class="description">
                <p>${product.productDescription}</p>
                </div>
                <input type="number" name="quantite" value="1" min="1"/>
                <input type="submit" class="add-to-cart" value="Ajouter au panier">
                </form>
           </div>


      </div>
      </c:if>


      <div class="grid related-products">
        <div class="column-xs-12">
          <h3>Voir également ... </h3>
        </div>
        <div class="column-xs-12 column-md-4">
          <img src="images/index/chat-card.png">
          <h4>Succulent</h4>
          <p class="price">19.99€</p>
        </div>
        <div class="column-xs-12 column-md-4">
          <img src="images/index/chat-card.png">
          <h4>Terranium</h4>
          <p class="price">19.99€</p>
        </div>
        <div class="column-xs-12 column-md-4">
          <img src="images/index/chat-card.png">
          <h4>Cactus</h4>
          <p class="price">19.99€</p>
        </div>
      </div>
    </div>
  </main>
  <%@ include file="components/footer.jsp" %>
        <script src="script/product.js"></script>
      	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>
