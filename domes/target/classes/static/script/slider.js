var swiper = new Swiper(".mySwiperRecommandation", {
    // autoplay: {
    //     delay: 500,
    //     disableOnInteraction: false,
    // },
        centered: true,
    loop: true,
    loopFillGroupWithBlank: true,
    slidesPerView: 3,
    centeredSlides: true,
        roundLengths: true,
        loop: true,
    spaceBetween: 30,
    pagination: false,
    breakpoints: {
        0: {
            slidesPerView: 1,
        },
        585: {
            slidesPerView: 2,
        },
        850: {
            slidesPerView : 3,
        }
    },
});

// GRID SWIPER "NOS ANIMAUX"


var swiper = new Swiper(".mySwiperAnimal", {
    slidesPerView: 4,
    grid: {
        rows: 3,
        fill: "row",
    },
    breakpoints: {
        0: {
            slidesPerView: 1,
        },
        368: {
            slidesPerView: 2,
        },
        480: {
            slidesPerView: 3,
        },
        768: {
            slidesPerView : 4,
        }
    },
    spaceBetween: 15,
    pagination: {
        el: ".swiper-pagination",
        clickable: true,
    },

});