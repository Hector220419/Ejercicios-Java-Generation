"use strict" // Buenas prácticas

const buttonValues = document.getElementById("buttonPress");
const place = document.getElementById("tarjeta");

buttonValues.addEventListener("click", e =>{
    askValues();
});

function askValues(){
let var1 = prompt("Ingresa el primer numero: ");
let var2 = prompt("Ingresa el segundo numero ");
let var3 = prompt("Ingresa el tercer numero ");

orderValues(var1, var2, var3);

}

function orderValues(var1, var2, var3){
    let array = [var1, var2, var3];
    array.sort((a,b)=> a-b);
    for(let i = 0; i<array.length; i++){
        card(array[i]);
    }

}

function card(n){
    place.innerHTML += `<div class="card">
    <div class="card-body">
      Number: ${n}
    </div>
    </div>`;
}