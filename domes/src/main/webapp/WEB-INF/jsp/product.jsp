<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="/style/product.css" rel="stylesheet">
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
   <div class="container my-5">

        <div class="card details-card p-0">
            <div class="row">

                <div class="col-md-6 col-sm-12">
                   <!--  <img class="img-fluid details-img" src="https://source.unsplash.com/5Tm4YRqnNcM" alt=""> -->
                </div>
                <div class="col-md-6 col-sm-12 description-container p-5">
                    <div class="main-description">
                        <p class="product-category mb-0">Chien</p>
                        <h3>Paf le chien</h3>
                        <hr>
                        <p class="product-price">€1199.00</p>
                        <form action="../Panier" class="add-inputs" method="post" >
                            <input type="number" class="form-control" id="cart_quantity" name="idProduit" value="1">
                            <button type="submit" class="mt-2 btn btn-primary btn-lg">Ajouter au panier</button>
                        </form>
                        <br>
                        <form class="add-inputs" method="post">
                            <button name="add_to_cart" type="submit" class="btn btn-primary btn-lg">Ajouter aux favoris</button>
                        </form>
                        <div style="clear:both"></div>

                        <hr>


                        <p class="product-title mt-4 mb-1">A propos de Paf</p>
                        <p class="product-description mb-4">
                            Lorem ipsum dolor sit amet consectetur, adipisicing elit. Quis assumenda voluptatem tempore dolor quod. Expedita, id, minus similique dolor sed adipisci aliquam natus amet doloremque delectus cupiditate? Sint, quasi, ad necessitatibus omnis quaerat tenetur corporis porro aut, natus ex ab id vel odit veniam fugiat temporibus aperiam quia rem minima!
                        </p>

                        <hr>
                        <ul class="social-list">
                            <li><a href="#"><i class="fa-brands fa-facebook"></a></i></li>
                            <li><a href="#"><i class="fa-brands fa-twitter"></a></i></li>
                            <li><a href="#"><i class="fa-brands fa-square-instagram"></a></i></li>

                        </ul>






                    </div>




                </div>
            </div>
            <!-- End row -->
        </div>
      	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>