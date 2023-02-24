'use strict'

const switcher = document.querySelector('.btn')

switcher.addEventListener('click', darkTheme())

function darkTheme(){
    document.body.classList.toggle('dark-theme');

    var className = document.body.className;

    if (className == 'light-theme'){
        this.textContent = 'Escuridão';
        console.log('minha classe e: ' + className);
    } else {
        this.textContent = 'Luz'
    }

}