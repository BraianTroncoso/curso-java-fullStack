// Call the dataTables jQuery plugin
$(document).ready(function() {
    // on ready
});

async function registrarUsuarios(){
    let datos = {};
    datos.nombre =
   const request = await fetch('api/usuarios', {
     method: 'POST',
     headers: {
       'Accept': 'application/json',
       'Content-Type': 'application/json'
     },
       body: JSON.stringify(datos,)
   });
   const usuarios = await request.json();



   let listadoHtml = '';
   for (let usuario of usuarios){
       let botonEliminar = '<a href="#" onclick="eliminarUsuario(' + usuario.id + ')" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';
       let usuarioHtml = '<tr><td>'+usuario.id +'</td><td>'+usuario.nombre+ ' ' +usuario.apellido+
                           '</td><td>'+usuario.email+
                           '</td><td>'+usuario.telefono+
                           '</td><td>'+botonEliminar+'</td></tr>'
       listadoHtml += usuarioHtml;
   }

document.querySelector('#usuarios tbody').outerHTML = listadoHtml;
}



