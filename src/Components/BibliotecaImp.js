import React from "react";
import { Link } from "react-router-dom";
import "../Styles/Biblioteca.css";

function BibliotecaImp(props){
  return(
    <div class="col-md-4 single-note-item all-category note-important">
      <div class="card card-body">
        <span class="side-stick"></span>
        <h5 class="note-title text-truncate w-75 mb-0" data-noteheading="Go for lunch">{props.titulo}<i class="point fa fa-circle ml-1 font-10"></i></h5>
        <p class="note-date font-12 text-muted">{props.fecha}</p>
        <div class="note-content">
          <p class="note-inner-content text-muted" data-notecontent="Blandit tempus porttitor aasfs. Integer posuere erat a ante venenatis.">{props.contenido}</p>
        </div>
        <div class="d-flex align-items-center">
          <span class="mr-1"><i class="fa fa-star favourite-note"></i></span>
          <span class="mr-1"><i class="fa fa-trash remove-note"></i></span>
          <div class="ml-auto">
            <div class="category-selector btn-group">
              <a class="nav-link dropdown-toggle category-dropdown label-group p-0" data-toggle="dropdown" href="javascript:void(0);" role="button" aria-haspopup="true" aria-expanded="true">
                <div class="category">
                  <div class="category-business"></div>
                  <div class="category-social"></div>
                  <div class="category-important"></div>
                  <span class="more-options text-dark"><i class="icon-options-vertical"></i></span>
                </div>
              </a>
              <div class="dropdown-menu dropdown-menu-right category-menu">
                <Link class="note-business badge-group-item badge-business dropdown-item position-relative category-business text-success" to="/Notas">
                  <i class="mdi mdi-checkbox-blank-circle-outline mr-1"></i>Abrir
                </Link>
                <a class="note-social badge-group-item badge-social dropdown-item position-relative category-social text-info" href="javascript:void(0);">
                  <i class="mdi mdi-checkbox-blank-circle-outline mr-1"></i> Editar
                </a>
                <a class="note-important badge-group-item badge-important dropdown-item position-relative category-important text-danger" href="javascript:void(0);">
                  <i class="mdi mdi-checkbox-blank-circle-outline mr-1"></i> Eliminar
                </a>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  );

}
export default BibliotecaImp;