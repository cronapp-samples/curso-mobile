window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Imagem = window.blockly.js.blockly.Imagem || {};

/**
 * Imagem
 */
window.blockly.js.blockly.Imagem.ObterImagemCamera = function() {
 var item, enderecoImagem;
  this.cronapi.cordova.camera.getPicture(function(sender_enderecoImagem) {
      enderecoImagem = sender_enderecoImagem;
    this.cronapi.screen.changeValueOfField("User.active.picture", enderecoImagem);
    this.cronapi.screen.changeAttrValue("crn-image-foto", 'src', enderecoImagem);
  }.bind(this), function(sender_item) {
      item = sender_item;
    window.alert('Erro na obtenção do arquivo da camera!!');
  }.bind(this), '1', '1', '0', 'true');
}
