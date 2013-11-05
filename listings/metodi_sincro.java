/**
* Metodo che scarica i dati presenti nel server
* per ogni store presente nel registro.
*/
downloadFromServer: function()
{
      for (i = 0; i < this.getRegistry().length; i++)
      {
	      var store = this.getRegistry()[i];
	      this.getStore(store).download();
      }
},

/**
* Metodo che carica i dati aggiornati sul server
* per ogni store presente nel registro.
*/
uploadToServer: function()
{
      for (i = 0; i < this.getRegistry().length; i++)
      {
	      var store = this.getRegistry()[i];
	      this.getStore(store).upload();
      }
}
