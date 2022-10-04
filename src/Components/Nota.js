import React from "react";
import '../Styles/Notas.css';

function Nota(props){
  return(
    <div class="col mb-4">
      <div class="card">
        <img 
          src={require(`../../img/${props.image}.jpg`)} 
          class="card-img-top" 
          alt={props.alt}
        />
        <div class="card-body">
          <h5 class="card-title">{props.title}</h5>
          <p class="card-text">{props.content}</p>
        </div>
      </div>
    </div>
  )
}

export default Nota;