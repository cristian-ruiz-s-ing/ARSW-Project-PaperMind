import React from 'react';
import '../Styles/Notas.css';
import NavbarN from './NavbarN';
import Nota from './Nota';

/*import NavbarN from './NavbarN';
import Biblioteca from './Biblioteca';*/

function Notas() {
  return (
    <div className="Notas">
      <NavbarN/>
      <div class="row row-cols-1 row-cols-md-5">
        <Nota
          image='image-1'
          alt='...'
          title='Tqm jijiji'
          content='La verdad es que no tqm, o bueno sí pero no tanto :('
        />
        <Nota
          image='alimentacion'
          title='Mi dieta'
          content='Me toca comer pollito el jueves y pezcado el sábado y lunes'
        />
        <Nota
          image='estudio'
          title='Tareas ARSW'
          content='Toca trabajarle más al proyecto que a los labs porque el proyecto al menos sí vale'
        />
        <Nota
          image='gim'
          title='Mi rutina'
          content='Correr 20 min, 50 sentadillas en 5 series de a 10 y descansar por 3 meses masomenos :)'
        />
        <Nota
          image='programación'
          title='Aprender React y JavaScript'
          content='Realizar los cursos que tengo guardados de React, con los ejercicios propuestos, y de JavaScript'
        />
      </div>      
    </div>
  );
}

export default Notas;
