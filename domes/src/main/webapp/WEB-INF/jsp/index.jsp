<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/index.css">
    <link rel="stylesheet" href="css/header.css">
    <link rel="stylesheet" href="css/footer.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/swiper@8/swiper-bundle.min.css" />
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <title>Document</title>
</head>

<body>
     <jsp:include page="components/header.jsp" />

    <main>
        <!-- Image top  -->
        <section class="slider--img-landing">
            <img src="images/index/chat.jpg" alt="">
        </section>

        <!-- Recommandation -->
        <div class="text--between">
            <p>Recommandations</p>
        </div>

        <!-- Card Recommandation -->
        <c:if test="${!empty(ListeCarousel)}">

        <div class="swiper mySwiperRecommandation">
            <div class="swiper-wrapper">
                <c:forEach var="liste" items="${ListeCarousel}">

                <div class="swiper-slide">
                    <section class="slider--recommandation">


                        <div class="slider--card">
                            <div class="img--card">
                                <img src="images/index/chat-card.png" alt="">
                            </div>
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

                </div>
            </div>
            <div class="swiper-pagination"></div>
        </div>

        </c:if>

        <!-- Recommandation -->
        <div class="text--between">
            <p>Nos Animaux</p>
        </div>

        <section class="slider--container">
            <div class="slider--config">
                <div class="swiper mySwiperAnimal swiper--grid">
                    <div class="swiper-wrapper">
                        <div class="swiper-slide swiper-slide--grid"><img src="images/index/chat-card.png" alt=""></div>
                        <div class="swiper-slide swiper-slide--grid"><img src="images/index/chat-card.png" alt=""></div>
                        <div class="swiper-slide swiper-slide--grid"><img src="images/index/chat-card.png" alt=""></div>
                        <div class="swiper-slide swiper-slide--grid"><img src="images/index/chat-card.png" alt=""></div>

                    </div>
                    <div class="swiper-pagination"></div>
                </div>
            </div>
        </section>
        

        <div class="text--between">
            <p>Nos Services</p>
        </div>

        <section class="services">
            <div class="container--services">
                <img src="images/index/help.png" alt="">
                <p>Service clients 6j/7</p>
            </div>
            <div class="container--services">
                <img src="images/index/protection.png" alt="">
                <p>Satisfait ou remboursé</p>
            </div>
            <div class="container--services">
                <img src="images/index/paiement-securise.png" alt="">
                <p>Paiement sécurisé en 3 ou 4 fois</p>
            </div>
        </section>

        <div class="text--between">
            <p>Pour vous accompagner</p>
        </div>

        <section class="services--additional">
            <div class="img">
                <img src="images/index/service-image/adoption.png" alt="">
            </div>
            <div class="img">
                <img src="images/index/service-image/carte-plus.png" alt="">
            </div>
            <div class="img">
                <img src="images/index/service-image/engagement.png" alt="">
            </div>
            <div class="img">
                <img src="images/index/service-image/toilettage.png" alt="">
            </div>
            <div class="img">
                <img src="images/index/service-image/conseils.png" alt="">
            </div>
            <div class="img">
                <img src="images/index/service-image/calendrier.png" alt="">
            </div>
        </section>

    </main>

    <jsp:include page="components/footer.jsp" />

    <script src="https://cdn.jsdelivr.net/npm/swiper@8/swiper-bundle.min.js"></script>
    <script src="script/slider.js"></script>
</body>

</html>