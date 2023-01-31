const search = document.querySelector(".bottom--domes-right");
const nav = document.querySelector(".bottom--domes-left");
const input = document.querySelector("#search");

input.addEventListener('focus', ()=>{
    search.classList.add("width--animate");
    nav.style.margin = "0 0 0 2%";
  
});
input.addEventListener('focusout', ()=>{
  search.classList.remove("width--animate");
  nav.style.margin = "0 0 0 7%";
});
