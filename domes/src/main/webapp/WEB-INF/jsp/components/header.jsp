
    <div class="header-height"></div>
    <header>
        <nav class="header">
            <div class="top--domes-profil">
                <div class="header--logo">
                    <img src="images/multi-page/logo.png" alt="domes">
                </div>
                <h2>domes</h2>
                <div class="profil">
                    <div class="navbar fixed-top">
                        <div class="container-fluid">

                            <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas"
                                data-bs-target="#offcanvasNavbar" aria-controls="offcanvasNavbar">
                                <span class="navbar-toggler-icon"></span>
                            </button>
                            <div class="offcanvas offcanvas-end" tabindex="-1" id="offcanvasNavbar"
                                aria-labelledby="offcanvasNavbarLabel">
                                <div class="offcanvas-header">
                                    <h5 class="offcanvas-title" id="offcanvasNavbarLabel">Domes Services</h5>
                                    <button type="button" class="btn-close" data-bs-dismiss="offcanvas"
                                        aria-label="Close"></button>
                                </div>
                                <div class="offcanvas-body">
                                    <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
                                        <li class="nav-item">
                                            <a class="nav-link active" aria-current="page" href="#">Accueil</a>
                                        </li>

                                        <li class="nav-item dropdown">
                                            <a class="nav-link dropdown-toggle" href="#" role="button"
                                                data-bs-toggle="dropdown" aria-expanded="false">
                                                Chiens
                                            </a>
                                            <ul class="dropdown-menu">
                                                <li><a class="dropdown-item" href="#">Action</a></li>
                                                <li><a class="dropdown-item" href="#">Another action</a></li>
                                                <!-- <li>
                                                <hr class="dropdown-divider">
                                            </li>
                                            <li><a class="dropdown-item" href="#">Something else here</a></li> -->
                                            </ul>
                                        </li>

                                        <li class="nav-item dropdown">
                                            <a class="nav-link dropdown-toggle" href="#" role="button"
                                                data-bs-toggle="dropdown" aria-expanded="false">
                                                Chats
                                            </a>
                                            <ul class="dropdown-menu">
                                                <li><a class="dropdown-item" href="#">Action</a></li>
                                                <li><a class="dropdown-item" href="#">Another action</a></li>
                                                <!-- <li>
                                                <hr class="dropdown-divider">
                                            </li>
                                            <li><a class="dropdown-item" href="#">Something else here</a></li> -->
                                            </ul>
                                        </li>

                                        <li class="nav-item dropdown">
                                            <a class="nav-link dropdown-toggle" href="#" role="button"
                                                data-bs-toggle="dropdown" aria-expanded="false">
                                                Oiseaux
                                            </a>
                                            <ul class="dropdown-menu">
                                                <li><a class="dropdown-item" href="#">Action</a></li>
                                                <li><a class="dropdown-item" href="#">Another action</a></li>
                                                <!-- <li>
                                                <hr class="dropdown-divider">
                                            </li>
                                            <li><a class="dropdown-item" href="#">Something else here</a></li> -->
                                            </ul>
                                        </li>

                                        <li class="nav-item dropdown">
                                            <a class="nav-link dropdown-toggle" href="#" role="button"
                                                data-bs-toggle="dropdown" aria-expanded="false">
                                                Insectes
                                            </a>
                                            <ul class="dropdown-menu">
                                                <li><a class="dropdown-item" href="#">Action</a></li>
                                                <li><a class="dropdown-item" href="#">Another action</a></li>
                                                <!-- <li>
                                                <hr class="dropdown-divider">
                                            </li>
                                            <li><a class="dropdown-item" href="#">Something else here</a></li> -->
                                            </ul>
                                        </li>

                                        <li class="nav-item dropdown">
                                            <a class="nav-link dropdown-toggle" href="#" role="button"
                                                data-bs-toggle="dropdown" aria-expanded="false">
                                                Poissons
                                            </a>
                                            <ul class="dropdown-menu">
                                                <li><a class="dropdown-item" href="#">Action</a></li>
                                                <li><a class="dropdown-item" href="#">Another action</a></li>
                                                <!-- <li>
                                                <hr class="dropdown-divider">
                                            </li>
                                            <li><a class="dropdown-item" href="#">Something else here</a></li> -->
                                            </ul>
                                        </li>

                                        <li class="nav-item dropdown">
                                            <a class="nav-link dropdown-toggle" href="#" role="button"
                                                data-bs-toggle="dropdown" aria-expanded="false">
                                                Reptiles
                                            </a>
                                            <ul class="dropdown-menu">
                                                <li><a class="dropdown-item" href="#">Action</a></li>
                                                <li><a class="dropdown-item" href="#">Another action</a></li>
                                                <!-- <li>
                                                <hr class="dropdown-divider">
                                            </li>
                                            <li><a class="dropdown-item" href="#">Something else here</a></li> -->
                                            </ul>
                                        </li>

                                        <li class="nav-item">
                                            <a class="nav-link" href="#">Contact</a>
                                        </li>
                                    </ul>
                                    <form class="d-flex mt-3" role="search">
                                        <input class="inputText form-control me-2" type="search"
                                            placeholder="Votre recherche..." aria-label="Search">
                                        <button class="btn btn-outline-success" type="submit">GO</button>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                    <a class="profil-none" href="/login">Connexion</a>
                    <span class="profil-none"> | </span>
                    <a class="profil-none" href="#">Inscription</a>
                    <a class="profil-none" href="/domes/pages/panier.jsp">Panier</a>
                </div>
            </div>
            <div class="flex--header">
                <div class="top--domes-hidden"></div>
                <div class="bottom--domes-show">

                    <div class="bottom--domes-left">

                        <div class="dropdown" style="float:left;">
                            <button class="dropbtn">Chiens</button>
                            <div class="dropdown-content" style="left:0;">
                                <a href="#">Link 1</a>
                                <a href="#">Link 2</a>
                                <a href="${pageContext.servletContext.contextPath}/pages/panier.jsp">Link 3</a>
                            </div>
                        </div>

                        <div class="dropdown" style="float:left;">
                            <button class="dropbtn">Chats</button>
                            <div class="dropdown-content" style="left:0;">
                                <a href="#">Link 1</a>
                                <a href="#">Link 2</a>
                                <a href="#">Link 3</a>
                            </div>
                        </div>

                        <div class="dropdown" style="float:left;">
                            <button class="dropbtn">Oiseaux</button>
                            <div class="dropdown-content" style="left:0;">
                                <a href="#">Link 1</a>
                                <a href="#">Link 2</a>
                                <a href="#">Link 3</a>
                            </div>
                        </div>

                        <div class="dropdown" style="float:left;">
                            <button class="dropbtn">Insectes</button>
                            <div class="dropdown-content" style="left:0;">
                                <a href="#">Link 1</a>
                                <a href="#">Link 2</a>
                                <a href="#">Link 3</a>
                            </div>
                        </div>

                        <div class="dropdown" style="float:left;">
                            <button class="dropbtn">Poissons</button>
                            <div class="dropdown-content" style="left:0;">
                                <a href="#">Link 1</a>
                                <a href="#">Link 2</a>
                                <a href="#">Link 3</a>
                            </div>
                        </div>

                        <div class="dropdown" style="float:left;">
                            <button class="dropbtn">Reptiles</button>
                            <div class="dropdown-content" style="left:0;">
                                <a href="#">Link 1</a>
                                <a href="#">Link 2</a>
                                <a href="#">Link 3</a>
                            </div>
                        </div>
                    </div>

                    <div class="bottom--domes-right">
                        <div id="wrap">
                            <form action="" autocomplete="on">
                                <input id="search" name="search" type="text" placeholder="Votre recherche...">
                                <input id="search_submit" value="Rechercher" type="submit" class="search-submit " style="background-image: url('images/multi-page/loupe.png');">
                            </form>
                        </div>
                        <!-- <div class="dropdown" style="float:right;">
                    <button class="dropbtn">Right</button>
                    <div class="dropdown-content">
                        <a href="#">Link 1</a>
                        <a href="#">Link 2</a>
                        <a href="#">Link 3</a>
                    </div>
                     </div> -->
                    </div>
                </div>
            </div>
        </nav>
    </header>
