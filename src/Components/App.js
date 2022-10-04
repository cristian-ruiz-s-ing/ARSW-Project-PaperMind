import React from 'react';
import '../Styles/App.css';
import Navbar from './Navbar';
import NavbarSelec from './NavbarSelec';
import Biblioteca from './Biblioteca.js';
import BibliotecaImp from './BibliotecaImp.js';
import { DragDropContext, Droppable } from '@hello-pangea/dnd';


/*
import { BrowserRouter, Route } from 'react-router-dom';
import Notas from './Notas';
<BrowserRouter>
  <Route exact path='/Notas' element={Notas} />
</BrowserRouter>*/

function App() {
  return (
    <DragDropContext onDragEnd={(result) => console.log(result)}>
      <div className="App">
        <Navbar />
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet"/>
        <div class="page-content container note-has-grid">
          <NavbarSelec/>
          <div class="tab-content bg-transparent">
            <Droppable droppableId="bibliotecas">
              {(droppableProvided)=> (
              <div {...droppableProvided.droppableProps} ref={droppableProvided.innerRef} id="note-full-container" class="note-has-grid row">
                <BibliotecaImp
                  index='0'
                  titulo= 'Importantes Uni 1'
                  fecha= '01 Abril 2022'
                  contenido = 'Notas importantes a tener en cuenta para la universidad'
                />
                <Biblioteca
                  index='1'
                  titulo= 'Notas personales 1'
                  fecha= '19 Octubre 2022'
                  contenido = 'En esta biblioteca guardaré sólo notas personales que no se pueden compartir con nadie'
                />
                <BibliotecaImp
                  index='2'
                  titulo= 'Importantes Uni 2'
                  fecha= '02 Abril 2022'
                  contenido = 'Notas importantes a tener en cuenta para la universidad'
                />
                <BibliotecaImp
                  index='3'
                  titulo= 'Importantes Uni 3'
                  fecha= '03 Abril 2022'
                  contenido = 'Notas importantes a tener en cuenta para la universidad'
                />
                <Biblioteca
                  index='4'
                  titulo= 'Notas personales 2'
                  fecha= '20 Octubre 2022'
                  contenido = 'En esta biblioteca guardaré sólo notas personales que no se pueden compartir con nadie'
                />
                <Biblioteca
                  index='5'
                  titulo= 'Notas personales 3'
                  fecha= '21 Octubre 2022'
                  contenido = 'En esta biblioteca guardaré sólo notas personales que no se pueden compartir con nadie'
                />
                <BibliotecaImp
                  index='6'
                  titulo= 'Importantes Uni 4'
                  fecha= '05 Abril 2022'
                  contenido = 'Notas importantes a tener en cuenta para la universidad'
                />
                {droppableProvided.placeholder}
              </div>)}
            </Droppable>
          </div>
        </div>
      </div>
    </DragDropContext>
  );
}

export default App;
