import './App.css';
import Navbar from './Components/Navbar';
import NavbarSelec from './Components/NavbarSelec';
import Biblioteca from './Components/Biblioteca.js';
import BibliotecaImp from './Components/BibliotecaImp.js';

function App() {
  return (
    <div className="App">
      <Navbar />
      <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet"/>
      <div class="page-content container note-has-grid">
        <NavbarSelec/>
        <div class="tab-content bg-transparent">
          <div id="note-full-container" class="note-has-grid row">
            <BibliotecaImp
              titulo= 'Importantes Uni 1'
              fecha= '01 Abril 2022'
              contenido = 'Notas importantes a tener en cuenta para la universidad'
            />
            <Biblioteca
              titulo= 'Notas personales 1'
              fecha= '19 Octubre 2022'
              contenido = 'En esta biblioteca guardaré sólo notas personales que no se pueden compartir con nadie'
            />
            <BibliotecaImp
              titulo= 'Importantes Uni 2'
              fecha= '02 Abril 2022'
              contenido = 'Notas importantes a tener en cuenta para la universidad'
            />
            <BibliotecaImp
              titulo= 'Importantes Uni 3'
              fecha= '03 Abril 2022'
              contenido = 'Notas importantes a tener en cuenta para la universidad'
            />
            <Biblioteca
              titulo= 'Notas personales 2'
              fecha= '20 Octubre 2022'
              contenido = 'En esta biblioteca guardaré sólo notas personales que no se pueden compartir con nadie'
            />
            <Biblioteca
              titulo= 'Notas personales 3'
              fecha= '21 Octubre 2022'
              contenido = 'En esta biblioteca guardaré sólo notas personales que no se pueden compartir con nadie'
            />
            <BibliotecaImp
              titulo= 'Importantes Uni 4'
              fecha= '05 Abril 2022'
              contenido = 'Notas importantes a tener en cuenta para la universidad'
            />
          </div>
        </div>
      </div>
    </div>
  );
}

export default App;
