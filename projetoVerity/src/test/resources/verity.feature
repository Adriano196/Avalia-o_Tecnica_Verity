#Author: br.com.adr196

 @tag
  Feature: Acessar site Verity, buscar elementos e validar
  Eu como usuario vou acessar o site da Verity para realizar busca

 Background: Acessar site
  Given que acesse o site "https://www.verity.com.br"

  Scenario: Validacao de titulos
    When clicar no menu o que fazemos
    Then validar "Digital Culture"
    And  depois "Digital Tech"
    And e voltar a tela inicial e validar "Nossas soluções_"

   
  Scenario: Cadastro de contato
    When clicar no menu contato
    And preencher o campo nome com "Adriano Jose da Silva"
    And o campo Email com "adr196@hotmail.com"
    And o campo Telefone Celular com "19 971025156"
    And quando inserir a resposta "Muito obrigado pela oportunidade. Eu quero agregar a essa excelente empresa."
    Then vou clicar no checkbox
    And enviar
