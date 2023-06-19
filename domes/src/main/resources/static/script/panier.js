const overlay = $("#overlay");
const modalGreat = $("#modalGreat");
var modalContent = document.querySelector('.checkout');
var outsideModal = document.querySelector('body');
const modal = document.querySelector('.blackElement');
const modalInput = document.querySelector('#promo-code');
const modalBody = document.querySelector('body');
$('.input-cart-number').on('keyup change', function () {
  $t = $(this);

  if ($t.val().length > 3) {
    $t.next().focus();
  }

  var card_number = '';
  $('.input-cart-number').each(function () {
    card_number += $(this).val() + ' ';
    if ($(this).val().length == 4) {
      $(this).next().focus();
    }
  })

  $('.credit-card-box .number').html(card_number);
});

$('#card-holder').on('keyup change', function () {
  $t = $(this);
  $('.credit-card-box .card-holder div').html($t.val());
});

$('#card-holder').on('keyup change', function () {
  $t = $(this);
  $('.credit-card-box .card-holder div').html($t.val());
});

$('#card-expiration-month, #card-expiration-year').change(function () {
  m = $('#card-expiration-month option').index($('#card-expiration-month option:selected'));
  m = (m < 10) ? '0' + m : m;
  y = $('#card-expiration-year').val().substr(2, 2);
  $('.card-expiration-date div').html(m + '/' + y);
})

$('#card-ccv').on('focus', function () {
  $('.credit-card-box').addClass('hover');
}).on('blur', function () {
  $('.credit-card-box').removeClass('hover');
}).on('keyup change', function () {
  $('.ccv div').html($(this).val());
});

$(document).ready(function () {
  $('.input-cart-number').on('input', function () {
    $(this).val(function (i, value) {
      return value.replace(/\D/g, '');
    });
  });
});

function etatCard(){
 if (modal.style.display === 'none') {
  console.log("ferme");
       modalInput.classList.remove("bgcNoneInput");
       modalBody.classList.remove("bgcNone");
  }else if(modal.style.display === 'block'){
  console.log("ouvert");
    modalInput.classList.add("bgcNoneInput");
    modalBody.classList.add("bgcNone");
   }
}


function openModal() {
  overlay.css("display", "block");

}

function closeModal() {
  overlay.css("display", "none");
}

// Utilisez cette fonction pour afficher le modal lorsqu'une commande est validée
function showConfirmationModal() {
  hideModal();
  openModal();
}


/*--------------------
CodePen Tile Preview
--------------------*/
setTimeout(function () {
  $('#card-ccv').focus().delay(1000).queue(function () {
    $(this).blur().dequeue();
  });
}, 500);


function showModal() {
  console.log("show");
  modal.style.display = 'block';
  etatCard();
}

function hideModal() {
  console.log("hide")

  modal.style.display = 'none';
  etatCard();
}



// Ajoutez un événement de clic sur l'élément
outsideModal.addEventListener('click', function (event) {
  if (event.target === outsideModal) {

    modal.style.display = 'none';
    etatCard();
  }
});

// Empêchez la propagation de l'événement de clic à l'intérieur du modal
modalContent.addEventListener('click', function (event) {
  event.stopPropagation();
});

