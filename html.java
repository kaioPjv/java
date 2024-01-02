<html lang="pt"
	xmlns="http://www.w3.org/1999/xhtml"
	xmlns:site="http://site.algaworks.com">
<head>
	<meta charset="UTF-8"/>
	<meta http-equiv="X-UA-Compatible" content="IE=edge"/>
	<meta name="viewport" content="width=device-width, initial-scale=1"/>
	
	<meta name="referrer" content="unsafe-url"/>

    <meta property="og:site_name" content="AlgaWorks" />
    <meta property="fb:app_id" content="208424089199655" />

    
    <title>Declarando vetores de 2 dimensões - Curso Online Lógica de Programação com Java para Iniciantes - AlgaWorks</title>

    <link rel="shortcut icon" href="/images/favicon-7002162ed4eb5e38fcdc70c37ddcaa82.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="/dist/css/vendors/highlightjs/styles/magula-6a66369d1ba8339c89d9346584a5cfca.css">
	<link rel="stylesheet" href="/dist/css/main-4c42a284504a239dfa683c8dfe414f2e.css"/>

    <link rel="preconnect" href="https://assets.algaworks.com/portal/">
    <link rel="preconnect" href="https://www.gravatar.com/">

    <!-- Infusionsoft Tracking Code -->
<script type="text/javascript" src="https://xb222.infusionsoft.com/app/webTracking/getTrackingCode"></script>



<!-- Popup Domination -->
<script src="https://cdn1.pdmntn.com/a/BkU2IOWcm.js"></script>

<!-- Pingdom -->
<script src="//rum-static.pingdom.net/pa-5c40a057cea07b001600085e.js" async></script>

<!-- Linkedin Rmkt -->
<script type="text/javascript">
_linkedin_partner_id = "290401";
window._linkedin_data_partner_ids = window._linkedin_data_partner_ids || [];
window._linkedin_data_partner_ids.push(_linkedin_partner_id);
</script><script type="text/javascript">
(function(){var s = document.getElementsByTagName("script")[0];
var b = document.createElement("script");
b.type = "text/javascript";b.async = true;
b.src = "https://snap.licdn.com/li.lms-analytics/insight.min.js";
s.parentNode.insertBefore(b, s);})();
</script>
<noscript>
<img height="1" width="1" style="display:none;" alt="" src="https://dc.ads.linkedin.com/collect/?pid=290401&fmt=gif" />
</noscript>

<!-- begin whatsapp code -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
<a id="whatsapp-bubble" href="https://wa.me/5534996890006" Style=" position:fixed;width:60px;height:60px;bottom:40px;right:40px;background-color:#25d366;color:#FFF;border-radius:50px;text-align:center;font-size:30px;box-shadow: 1px 1px 2px #888;
z-index:1000;" target="_blank">
<i style="margin-top:16px" class="fa fa-whatsapp"></i>
</a>
<script>
var path = window.location.pathname;
if (path.startsWith("/certs/") || path.startsWith("/meus-cursos/") || path.startsWith("/aulas/") || path.startsWith("/forum/") ){
  document.getElementById("whatsapp-bubble").style.display = "none";
}
else {
   document.getElementById("whatsapp-bubble").style.display = "block";
}
</script>
<!-- end whatsapp code -->
    <!-- Global site tag (gtag.js) - Google Analytics -->
<script async src="https://www.googletagmanager.com/gtag/js?id=UA-3744390-3"></script>
<script>
  window.dataLayer = window.dataLayer || [];
  function gtag(){dataLayer.push(arguments);}
  gtag('js', new Date());

  gtag('config', 'UA-3744390-3'); // Google Analytics
  gtag('config', 'AW-1064837204'); // Google Ads
</script>

<!-- Facebook Pixel Code -->
<script>
  !function(f,b,e,v,n,t,s)
  {if(f.fbq)return;n=f.fbq=function(){n.callMethod?
  n.callMethod.apply(n,arguments):n.queue.push(arguments)};
  if(!f._fbq)f._fbq=n;n.push=n;n.loaded=!0;n.version='2.0';
  n.queue=[];t=b.createElement(e);t.async=!0;
  t.src=v;s=b.getElementsByTagName(e)[0];
  s.parentNode.insertBefore(t,s)}(window, document,'script',
  'https://connect.facebook.net/en_US/fbevents.js');
  fbq('init', '761143347253929');
  fbq('track', 'PageView');
</script>
<noscript><img height="1" width="1" style="display:none"
  src="https://www.facebook.com/tr?id=761143347253929&ev=PageView&noscript=1"
/></noscript>
<!-- End Facebook Pixel Code -->

    
</head>
<body>
    

    <input type="hidden" name="_csrf" value="1775a65b-4c21-4551-bea2-142672f3b701"/>
	<input type="hidden" name="_csrf_header" value="X-CSRF-TOKEN"/>
	
	<header class="l-header">
		<div class="o-container">

			<nav class="l-main-nav">
				<div class="l-main-nav__logo">
                    <a  href="/meus-cursos/">
                        <img src="/images/logo-algaworks-branca-c501cc137703d6338989f01840cf2b94.png"
					        width="145" height="30" alt="AlgaWorks" />
                    </a>
				</div>

                

                <div class="l-main-nav__menu">

                    <div class="c-user-dropdown js-user-dropdown">
                        <a href="javascript:;" class="js-user-dropdown-toggle c-user-dropdown__toggle">
                            <img src="//www.gravatar.com/avatar/5bf8214eb10790eb5f819d8d9c3ee6cb?s=50&amp;d=mm"
                                 class="c-user-dropdown__avatar"
                                 alt="Tliner Friaça Castro" />
                        </a>
                        <div class="js-user-dropdown-box c-user-dropdown__menu-box">
                            <div class="c-user-dropdown__user">
                                <span class="c-user-dropdown__user-name">Tliner Friaça Castro</span>
                                <span class="c-user-dropdown__user-email">tlinerfc@hotmail.com</span>
                            </div>

                            <ul class="c-user-dropdown__menu-list">
                                <li class="c-user-dropdown__menu-item">
                                    <a href="/meus-cursos">Meus cursos</a>
                                </li>
                                <li class="c-user-dropdown__menu-item">
                                    <a href="https://www.algaworks.com">Comprar cursos</a>
                                </li>
                                <li class="c-user-dropdown__menu-item">
                                    <a href="/minha-conta">Minha conta</a>
                                </li>

                                
                                <li class="c-user-dropdown__menu-item">
                                    <a href="/logout">Sair</a>
                                </li>
                            </ul>
                        </div>
                    </div>

                </div>
			</nav>
		</div>
	</header>

    <div style="right: 100px; position: absolute">

    </div>


	

    <input type="hidden" id="course_id" value="108"/>
    <input type="hidden" id="lesson_id" value="1370"/>

    <div class="c-video-navigator  c-video-navigator--previous">
        <div class="c-video-navigator__card">
            <div class="c-video-navigator__card-container">
                <span class="c-video-navigator__label">Aula anterior</span>
                <span class="c-video-navigator__title">Exercício 01: Cadastrando as tarefas do dia</span>
            </div>
        </div>

        <a href="/aulas/1369/exercicio-01-cadastrando-as-tarefas-do-dia"
            class="c-video-navigator__arrow">Aula anterior</a>
    </div>

    <div class="c-video-navigator  c-video-navigator--next">
        <div class="c-video-navigator__card">
            <div class="c-video-navigator__card-container">
                <span class="c-video-navigator__label">Próxima aula</span>
                <span class="c-video-navigator__title">Exercício 02: Encontre a semana de maior faturamento</span>
            </div>
        </div>
        <a href="/aulas/1371/exercicio-02-encontre-a-semana-de-maior-faturamento"
            class="c-video-navigator__arrow">Próxima aula</a>
    </div>



    <section class="l-page-headline">
        <div class="o-container">
            <h1 class="l-page-headline__title">7.4. Declarando vetores de 2 dimensões</h1>

            <div class="l-page-headline__breadcrumb">
                <span class="c-breadcrumb">
                    <a class="c-breadcrumb__path" href="/meus-cursos/logica-de-programacao-java">Lógica de Programação com Java para Iniciantes</a>
                    <span class="c-breadcrumb__path">Vetores</span>
                    <span class="c-breadcrumb__path">Declarando vetores de 2 dimensões</span>
                </span>
            </div>
        </div>
    </section>

    <div class="l-course-content">
        <div class="o-container">

            

            

            

            <div class="l-course-content l-course-content__video l-course-content__video-yt js-youtube-video-lesson" id="youtube-video-player">
                <iframe
                        id="video-iframe"
                        src="https://www.youtube.com/embed/VPv3Sfl1TB0?enablejsapi=1"
                        frameborder="0"
                        allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
                        allowfullscreen>
                </iframe>
            </div>

            

            <div class="l-course-content__actions">
                

                <span class="js-lesson-completed c-button
                   c-button--neutral  c-button--disabled  c-button--broader  c-button--icon-checked">Aula concluída em 04/11/2021</span>
            </div>

            <div class="l-course-content__links">
                <a class="c-button  c-button--warning  c-button--broader"
                	href="https://github.com/algaworks/curso-logica-de-programacao-com-java/tree/master/07.04-declarando-vetores-de-2-dimensoes/CursoLogicaCapitulo07/src" target="_blank">Código-fonte da aula</a>

                
            </div>

            <div class="l-course-content__content">
                <div class="c-accordion  js-accordion">
                    <ul class="c-accordion__tabs">
                        <li class="c-accordion__tab  js-accordion-tab   is-active js-conteudo-apoio sr-only"
                            data-accordion-pane-id="tab-content">
                            <a href="javascript:void(0)">Conteúdo de apoio</a>
                        </li>

                        <li class="c-accordion__tab  js-accordion-tab is-active"
                            data-accordion-pane-id="tab-curriculum">
                            <a href="javascript:void(0)">Conteúdo programático</a>
                        </li>

                        <li class="c-accordion__tab   js-accordion-tab" data-accordion-pane-id="tab-forum">
                            <a href="javascript:void(0)">Fórum e suporte</a>
                        </li>
                    </ul>

                    <div class="c-accordion__pane   is-active js-conteudo-apoio sr-only"
                         id="tab-content">

                        <article class="o-text-content   o-text   js-article-content"></article>

                        
                    </div>

                    <div class="c-accordion__pane is-active" id="tab-curriculum">
                        <!DOCTYPE html>
<html lang="pt" xmlns="http://www.w3.org/1999/xhtml">

    <body>
        <ol class="c-course-curriculum  js-accordion-group">
            <li class="c-course-curriculum__chapter">

                <a class="c-course-curriculum__chapter-container  js-accordion-group-toggle"
                   href="javascript:void(0)">
                    <h3 class="c-course-curriculum__chapter-name">Introdução</h3>
                </a>

                <ol class="c-course-curriculum__lessons  js-accordion-group-content">
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1317/introducao-ao-curso-de-logica-de-programacao">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Introdução ao curso de Lógica de Programação</span>
                            <span class="c-course-curriculum__lesson-duration">8m 38s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1318/introducao-a-computacao">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Introdução a computação</span>
                            <span class="c-course-curriculum__lesson-duration">5m 42s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1319/o-que-e-um-algoritmo">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">O que é um algoritmo</span>
                            <span class="c-course-curriculum__lesson-duration">11m 23s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1320/linguagens-de-programacao">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Linguagens de programação</span>
                            <span class="c-course-curriculum__lesson-duration">7m 11s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1321/como-comecar-e-terminar-o-curso">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Como começar e terminar o curso</span>
                            <span class="c-course-curriculum__lesson-duration">5m 47s</span>
                        </a>
                    </li>
                </ol>
            </li>
            <li class="c-course-curriculum__chapter">

                <a class="c-course-curriculum__chapter-container  js-accordion-group-toggle"
                   href="javascript:void(0)">
                    <h3 class="c-course-curriculum__chapter-name">Começando</h3>
                </a>

                <ol class="c-course-curriculum__lessons  js-accordion-group-content">
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1322/como-o-java-funciona">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Como o Java funciona?</span>
                            <span class="c-course-curriculum__lesson-duration">14m 54s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1323/instalando-o-eclipse">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Instalando o Eclipse</span>
                            <span class="c-course-curriculum__lesson-duration">13m 24s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1324/criando-o-primeiro-projeto-no-eclipse">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Criando o primeiro projeto no Eclipse</span>
                            <span class="c-course-curriculum__lesson-duration">4m 34s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1325/executando-um-programa-simples-no-eclipse">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Executando um programa simples no Eclipse</span>
                            <span class="c-course-curriculum__lesson-duration">10m 38s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1326/exercicio-01-alterando-a-mensagem-de-ola">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Exercício 01: Alterando a mensagem de Olá</span>
                            <span class="c-course-curriculum__lesson-duration"></span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1327/elaborando-um-algoritmo-no-eclipse">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Elaborando um algoritmo no Eclipse</span>
                            <span class="c-course-curriculum__lesson-duration">15m 4s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1328/exercicio-02-calculo-do-indice-de-massa-corporal">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Exercício 02: Cálculo do índice de massa corporal</span>
                            <span class="c-course-curriculum__lesson-duration"></span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1329/como-importar-um-projeto-no-eclipse">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Como importar um projeto no Eclipse</span>
                            <span class="c-course-curriculum__lesson-duration">8m 30s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1330/palavras-reservadas-do-java">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Palavras reservadas do Java</span>
                            <span class="c-course-curriculum__lesson-duration">5m 56s</span>
                        </a>
                    </li>
                </ol>
            </li>
            <li class="c-course-curriculum__chapter">

                <a class="c-course-curriculum__chapter-container  js-accordion-group-toggle"
                   href="javascript:void(0)">
                    <h3 class="c-course-curriculum__chapter-name">Variáveis e constantes</h3>
                </a>

                <ol class="c-course-curriculum__lessons  js-accordion-group-content">
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1331/introducao-a-variaveis">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Introdução a variáveis</span>
                            <span class="c-course-curriculum__lesson-duration">4m 27s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1332/tipos-de-dados-existentes">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Tipos de dados existentes</span>
                            <span class="c-course-curriculum__lesson-duration">5m 58s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1333/tipos-numericos-byte-short-integer-long">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Tipos numéricos (Byte, Short, Integer, Long)</span>
                            <span class="c-course-curriculum__lesson-duration">11m 31s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1334/exercicio-01-calculando-o-quadrado-de-um-numero">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Exercício 01: Calculando o quadrado de um número</span>
                            <span class="c-course-curriculum__lesson-duration"></span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1335/tipo-texto-string">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Tipo texto (String)</span>
                            <span class="c-course-curriculum__lesson-duration">7m 57s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1336/exercicio-02-faca-a-impressao-do-nome-e-do-sobrenome-da-pessoa">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Exercício 02: Faça a impressão do nome e do sobrenome da pessoa</span>
                            <span class="c-course-curriculum__lesson-duration"></span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1337/tipo-logico-boolean">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Tipo lógico (Boolean)</span>
                            <span class="c-course-curriculum__lesson-duration">12m 10s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1338/exercicio-03-crie-um-programa-que-informa-se-o-aluno-passou-de-ano">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Exercício 03: Crie um programa que informa se o aluno passou de ano</span>
                            <span class="c-course-curriculum__lesson-duration"></span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1339/tipos-primitivos">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Tipos primitivos</span>
                            <span class="c-course-curriculum__lesson-duration">10m 1s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1340/alterando-o-valor-de-uma-variavel">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Alterando o valor de uma variável</span>
                            <span class="c-course-curriculum__lesson-duration">16m 21s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1341/exercicio-04-encontre-o-valor-total-baseado-na-quantidade-e-no-desconto">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Exercício 04: Encontre o valor total baseado na quantidade e no desconto</span>
                            <span class="c-course-curriculum__lesson-duration"></span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1342/constantes">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Constantes</span>
                            <span class="c-course-curriculum__lesson-duration">13m 32s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1343/exercicio-05-constantes">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Exercício 05: Constantes</span>
                            <span class="c-course-curriculum__lesson-duration"></span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1344/escolhendo-bons-nomes-para-variaveis-e-constantes">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Escolhendo bons nomes para variáveis e constantes</span>
                            <span class="c-course-curriculum__lesson-duration">18m 33s</span>
                        </a>
                    </li>
                </ol>
            </li>
            <li class="c-course-curriculum__chapter">

                <a class="c-course-curriculum__chapter-container  js-accordion-group-toggle"
                   href="javascript:void(0)">
                    <h3 class="c-course-curriculum__chapter-name">Operadores</h3>
                </a>

                <ol class="c-course-curriculum__lessons  js-accordion-group-content">
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1345/introducao-a-operadores">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Introdução a operadores</span>
                            <span class="c-course-curriculum__lesson-duration">4m 33s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1346/operadores-aritmeticos">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Operadores aritméticos</span>
                            <span class="c-course-curriculum__lesson-duration">17m 33s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1347/exercicio-01-calculadora-simples">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Exercício 01: Calculadora simples</span>
                            <span class="c-course-curriculum__lesson-duration"></span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1348/operadores-relacionais">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Operadores relacionais</span>
                            <span class="c-course-curriculum__lesson-duration">23m 46s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1349/exercicio-02-desconto-de-frete-em-compras-acima-de-r10000">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Exercício 02: Desconto de frete em compras acima de R$100,00</span>
                            <span class="c-course-curriculum__lesson-duration"></span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1350/operadores-de-atribuicao">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Operadores de atribuição</span>
                            <span class="c-course-curriculum__lesson-duration">9m 20s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1351/exercicio-03-calculo-de-gastos-familiar">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Exercício 03: Cálculo de gastos familiar</span>
                            <span class="c-course-curriculum__lesson-duration"></span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1352/operadores-logicos">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Operadores lógicos</span>
                            <span class="c-course-curriculum__lesson-duration">22m 37s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1353/exercicio-04-verificacao-da-possibilidade-de-aposentadoria">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Exercício 04: Verificação da possibilidade de aposentadoria</span>
                            <span class="c-course-curriculum__lesson-duration"></span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1354/concatenacao-de-texto">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Concatenação de texto</span>
                            <span class="c-course-curriculum__lesson-duration">6m 33s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1355/operadores-de-incremento-e-decremento">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Operadores de incremento e decremento</span>
                            <span class="c-course-curriculum__lesson-duration">8m 27s</span>
                        </a>
                    </li>
                </ol>
            </li>
            <li class="c-course-curriculum__chapter">

                <a class="c-course-curriculum__chapter-container  js-accordion-group-toggle"
                   href="javascript:void(0)">
                    <h3 class="c-course-curriculum__chapter-name">Estruturas de decisão</h3>
                </a>

                <ol class="c-course-curriculum__lessons  js-accordion-group-content">
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1356/introducao-a-estruturas-de-decisao">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Introdução a estruturas de decisão</span>
                            <span class="c-course-curriculum__lesson-duration">2m 44s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1357/estrutura-if">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Estrutura “if”</span>
                            <span class="c-course-curriculum__lesson-duration">16m 16s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1358/exercicio-01-verificar-se-a-pessoa-passou-no-concurso-publico">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Exercício 01: Verificar se a pessoa passou no concurso público</span>
                            <span class="c-course-curriculum__lesson-duration"></span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1359/utilizando-o-if-encadeado">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Utilizando o “if” encadeado</span>
                            <span class="c-course-curriculum__lesson-duration">14m 57s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1360/exercicio-02-calcule-o-bonus-do-funcionarioa">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Exercício 02: Calcule o bônus do funcionário(a)</span>
                            <span class="c-course-curriculum__lesson-duration"></span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1378/estrutura-switch">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Estrutura &quot;switch&quot;</span>
                            <span class="c-course-curriculum__lesson-duration">20m 42s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1361/exercicio-03-imprima-o-nome-do-dia-da-semana-domingo-segunda-feira-etc">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Exercício 03: Imprima o nome do dia da semana (domingo, segunda-feira, etc.)</span>
                            <span class="c-course-curriculum__lesson-duration"></span>
                        </a>
                    </li>
                </ol>
            </li>
            <li class="c-course-curriculum__chapter">

                <a class="c-course-curriculum__chapter-container  js-accordion-group-toggle"
                   href="javascript:void(0)">
                    <h3 class="c-course-curriculum__chapter-name">Iteração</h3>
                </a>

                <ol class="c-course-curriculum__lessons  js-accordion-group-content">
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1362/introducao-a-iteracao">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Introdução a iteração</span>
                            <span class="c-course-curriculum__lesson-duration">2m 28s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1363/iterando-com-o-for">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Iterando com o “for”</span>
                            <span class="c-course-curriculum__lesson-duration">29m 1s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1364/exercicio-01-encontre-os-numeros-divisiveis-por-3">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Exercício 01: Encontre os números divisíveis por 3</span>
                            <span class="c-course-curriculum__lesson-duration"></span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1365/iterando-com-o-while">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Iterando com o “while”</span>
                            <span class="c-course-curriculum__lesson-duration">9m 51s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1366/exercicio-02-repita-o-exercicio-anterior-com-o-while">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Exercício 02: Repita o exercício anterior com o &quot;while&quot;</span>
                            <span class="c-course-curriculum__lesson-duration"></span>
                        </a>
                    </li>
                </ol>
            </li>
            <li class="c-course-curriculum__chapter">

                <a class="c-course-curriculum__chapter-container  js-accordion-group-toggle"
                   href="javascript:void(0)">
                    <h3 class="c-course-curriculum__chapter-name">Vetores</h3>
                </a>

                <ol class="c-course-curriculum__lessons  js-accordion-group-content">
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1367/introducao-a-vetores">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Introdução a vetores</span>
                            <span class="c-course-curriculum__lesson-duration">1m 38s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1368/declarando-vetores-de-1-dimensao">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Declarando vetores de 1 dimensão</span>
                            <span class="c-course-curriculum__lesson-duration">17m 40s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1369/exercicio-01-cadastrando-as-tarefas-do-dia">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Exercício 01: Cadastrando as tarefas do dia</span>
                            <span class="c-course-curriculum__lesson-duration"></span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed c-course-curriculum__lesson--current js-current-lesson">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1370/declarando-vetores-de-2-dimensoes">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Declarando vetores de 2 dimensões</span>
                            <span class="c-course-curriculum__lesson-duration">17m 15s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1371/exercicio-02-encontre-a-semana-de-maior-faturamento">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Exercício 02: Encontre a semana de maior faturamento</span>
                            <span class="c-course-curriculum__lesson-duration"></span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1372/declarando-vetores-com-mais-de-2-dimensoes">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Declarando vetores com mais de 2 dimensões</span>
                            <span class="c-course-curriculum__lesson-duration">6m 47s</span>
                        </a>
                    </li>
                </ol>
            </li>
            <li class="c-course-curriculum__chapter">

                <a class="c-course-curriculum__chapter-container  js-accordion-group-toggle"
                   href="javascript:void(0)">
                    <h3 class="c-course-curriculum__chapter-name">Métodos</h3>
                </a>

                <ol class="c-course-curriculum__lessons  js-accordion-group-content">
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1373/introducao-a-metodos">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Introdução a métodos</span>
                            <span class="c-course-curriculum__lesson-duration">2m 20s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1374/criando-o-primeiro-metodo">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Criando o primeiro método</span>
                            <span class="c-course-curriculum__lesson-duration">14m 32s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1375/exercicio-01-crie-um-segundo-metodo-no-algoritmo-da-aula-passada">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Exercício 01: Crie um segundo método no algoritmo da aula passada</span>
                            <span class="c-course-curriculum__lesson-duration"></span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1376/recebendo-parametros">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Recebendo parâmetros</span>
                            <span class="c-course-curriculum__lesson-duration">15m 30s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1377/exercicio-02-identifique-um-novo-padrao-no-algoritmo-da-aula-passada">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Exercício 02: Identifique um novo padrão no algoritmo da aula passada</span>
                            <span class="c-course-curriculum__lesson-duration"></span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1379/retornando-valores">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Retornando valores</span>
                            <span class="c-course-curriculum__lesson-duration">27m 5s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1380/exercicio-03-crie-uma-pequena-calculadora-de-subtracao-e-adicao">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Exercício 03: Crie uma pequena calculadora de subtração e adição</span>
                            <span class="c-course-curriculum__lesson-duration"></span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1381/recursividade">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Recursividade</span>
                            <span class="c-course-curriculum__lesson-duration">19m 42s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1382/exercicio-04-exibir-a-tabuada-de-um-numero-qualquer">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Exercício 04: Exibir a tabuada de um número qualquer</span>
                            <span class="c-course-curriculum__lesson-duration"></span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1383/escolhendo-bons-nomes-para-metodos">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Escolhendo bons nomes para métodos</span>
                            <span class="c-course-curriculum__lesson-duration">23m 24s</span>
                        </a>
                    </li>
                </ol>
            </li>
            <li class="c-course-curriculum__chapter">

                <a class="c-course-curriculum__chapter-container  js-accordion-group-toggle"
                   href="javascript:void(0)">
                    <h3 class="c-course-curriculum__chapter-name">Programação orientada a objetos</h3>
                </a>

                <ol class="c-course-curriculum__lessons  js-accordion-group-content">
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1384/introducao-a-programacao-orientada-a-objetos">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Introdução à programação orientada a objetos</span>
                            <span class="c-course-curriculum__lesson-duration">3m 18s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1385/criando-a-primeira-classe">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Criando a primeira classe</span>
                            <span class="c-course-curriculum__lesson-duration">18m 41s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1386/exercicio-01-metodo-que-informa-necessidade-de-repor-estoque">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Exercício 01: Método que informa necessidade de repor estoque</span>
                            <span class="c-course-curriculum__lesson-duration"></span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1387/metodos-de-instancia">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Métodos de instância</span>
                            <span class="c-course-curriculum__lesson-duration">27m 19s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1388/exercicio-02-metodo-de-instancia-que-informa-necessidade-de-repor-estoque">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Exercício 02: Método de instância que informa necessidade de repor estoque</span>
                            <span class="c-course-curriculum__lesson-duration"></span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1389/encapsulamento">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Encapsulamento</span>
                            <span class="c-course-curriculum__lesson-duration">20m 1s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1390/exercicio-03-exibindo-os-dados-de-um-pedido">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Exercício 03: Exibindo os dados de um pedido</span>
                            <span class="c-course-curriculum__lesson-duration"></span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1391/diferenca-entre-classe-e-instancia">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Diferença entre classe e instância</span>
                            <span class="c-course-curriculum__lesson-duration">19m 4s</span>
                        </a>
                    </li>
                </ol>
            </li>
            <li class="c-course-curriculum__chapter">

                <a class="c-course-curriculum__chapter-container  js-accordion-group-toggle"
                   href="javascript:void(0)">
                    <h3 class="c-course-curriculum__chapter-name">Leitura e escrita de dados em arquivos</h3>
                </a>

                <ol class="c-course-curriculum__lessons  js-accordion-group-content">
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1392/introducao-a-leitura-e-escrita">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Introdução à leitura e escrita</span>
                            <span class="c-course-curriculum__lesson-duration">2m 23s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1393/escrevendo-informacoes-em-arquivos-de-texto">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Escrevendo informações em arquivos de texto</span>
                            <span class="c-course-curriculum__lesson-duration">21m 6s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1394/exercicio-01-crie-uma-lista-de-tarefas-e-salve-a-lista-em-um-arquivo">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Exercício 01: Crie uma lista de tarefas e salve a lista em um arquivo</span>
                            <span class="c-course-curriculum__lesson-duration"></span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1395/lendo-informacoes-de-um-arquivo-de-texto">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Lendo informações de um arquivo de texto</span>
                            <span class="c-course-curriculum__lesson-duration">9m 1s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1396/exercicio-02-mostre-a-lista-de-tarefas-para-o-usuario">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Exercício 02: Mostre a lista de tarefas para o usuário</span>
                            <span class="c-course-curriculum__lesson-duration"></span>
                        </a>
                    </li>
                </ol>
            </li>
            <li class="c-course-curriculum__chapter">

                <a class="c-course-curriculum__chapter-container  js-accordion-group-toggle"
                   href="javascript:void(0)">
                    <h3 class="c-course-curriculum__chapter-name">Utilizando código de outros programadores</h3>
                </a>

                <ol class="c-course-curriculum__lessons  js-accordion-group-content">
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1397/introducao-ao-uso-de-codigos-de-terceiros">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Introdução ao uso de códigos de terceiros</span>
                            <span class="c-course-curriculum__lesson-duration">1m 25s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1398/bibliotecas-x-frameworks">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Bibliotecas x Frameworks</span>
                            <span class="c-course-curriculum__lesson-duration">6m 9s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1399/utilizando-uma-biblioteca-de-terceiro-para-envio-de-e-mails">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Utilizando uma biblioteca de terceiro para envio de e-mails</span>
                            <span class="c-course-curriculum__lesson-duration">22m 19s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1400/exercicio-01-crie-uma-lista-de-tarefas-e-envie-a-lista-por-email">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Exercício 01: Crie uma lista de tarefas e envie a lista por email</span>
                            <span class="c-course-curriculum__lesson-duration"></span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1401/criando-o-sua-propria-biblioteca">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Criando o sua própria biblioteca</span>
                            <span class="c-course-curriculum__lesson-duration">15m 24s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1402/exercicio-02-use-nossa-biblioteca">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Exercício 02: Use nossa biblioteca</span>
                            <span class="c-course-curriculum__lesson-duration"></span>
                        </a>
                    </li>
                </ol>
            </li>
            <li class="c-course-curriculum__chapter">

                <a class="c-course-curriculum__chapter-container  js-accordion-group-toggle"
                   href="javascript:void(0)">
                    <h3 class="c-course-curriculum__chapter-name">Algoritmos avançados</h3>
                </a>

                <ol class="c-course-curriculum__lessons  js-accordion-group-content">
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1403/introducao-aos-algoritmos-avancados">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Introdução aos algoritmos avançados</span>
                            <span class="c-course-curriculum__lesson-duration">2m 47s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1404/criando-uma-lista-dinamica">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Criando uma lista dinâmica</span>
                            <span class="c-course-curriculum__lesson-duration">16m 46s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1405/removendo-elementos-da-lista">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Removendo elementos da lista</span>
                            <span class="c-course-curriculum__lesson-duration">21m 27s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1406/ordenando-a-lista">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Ordenando a lista</span>
                            <span class="c-course-curriculum__lesson-duration">33m 0s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1407/exercicio-01-ordene-a-lista-de-alunos-do-arquivo">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Exercício 01: Ordene a lista de alunos do arquivo</span>
                            <span class="c-course-curriculum__lesson-duration"></span>
                        </a>
                    </li>
                </ol>
            </li>
            <li class="c-course-curriculum__chapter">

                <a class="c-course-curriculum__chapter-container  js-accordion-group-toggle"
                   href="javascript:void(0)">
                    <h3 class="c-course-curriculum__chapter-name">Pré-requisitos para nossa primeira aplicação web</h3>
                </a>

                <ol class="c-course-curriculum__lessons  js-accordion-group-content">
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1408/por-onde-comecar-a-criar-uma-aplicacao-web">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Por onde começar a criar uma aplicação web</span>
                            <span class="c-course-curriculum__lesson-duration">18m 36s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1409/evoluindo-para-o-spring-tool-suite-sts">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Evoluindo para o Spring Tool Suite (STS)</span>
                            <span class="c-course-curriculum__lesson-duration">6m 21s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1410/o-que-e-html">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">O que é HTML?</span>
                            <span class="c-course-curriculum__lesson-duration">22m 45s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1411/o-que-e-css">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">O que é CSS?</span>
                            <span class="c-course-curriculum__lesson-duration">16m 0s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1412/criando-um-projeto-com-o-sts">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Criando um projeto com o STS</span>
                            <span class="c-course-curriculum__lesson-duration">26m 32s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1413/incluindo-as-paginas-html-no-projeto">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Incluindo as páginas HTML no projeto</span>
                            <span class="c-course-curriculum__lesson-duration">6m 34s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1414/fluxo-de-uma-requisicao-web">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Fluxo de uma requisição web</span>
                            <span class="c-course-curriculum__lesson-duration">12m 34s</span>
                        </a>
                    </li>
                </ol>
            </li>
            <li class="c-course-curriculum__chapter">

                <a class="c-course-curriculum__chapter-container  js-accordion-group-toggle"
                   href="javascript:void(0)">
                    <h3 class="c-course-curriculum__chapter-name">Criando sua primeira aplicação</h3>
                </a>

                <ol class="c-course-curriculum__lessons  js-accordion-group-content">
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1415/importando-o-projeto-de-base">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Importando o projeto de base</span>
                            <span class="c-course-curriculum__lesson-duration">8m 12s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1416/criando-a-classe-contato">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Criando a classe Contato</span>
                            <span class="c-course-curriculum__lesson-duration">4m 58s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1417/configurando-o-armazenamento-de-contatos">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Configurando o armazenamento de contatos</span>
                            <span class="c-course-curriculum__lesson-duration">19m 46s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1418/listando-os-contatos-na-pagina">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Listando os contatos na página</span>
                            <span class="c-course-curriculum__lesson-duration">26m 20s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1419/o-padrao-javabean">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">O padrão JavaBean</span>
                            <span class="c-course-curriculum__lesson-duration">16m 4s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1420/fazendo-a-pagina-de-cadastro-funcionar">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Fazendo a página de cadastro funcionar</span>
                            <span class="c-course-curriculum__lesson-duration">25m 18s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1421/verbos-http">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Verbos HTTP</span>
                            <span class="c-course-curriculum__lesson-duration">22m 48s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1422/cadastrando-um-contato">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Cadastrando um contato</span>
                            <span class="c-course-curriculum__lesson-duration">16m 59s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1423/preparando-para-edicao">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Preparando para edição</span>
                            <span class="c-course-curriculum__lesson-duration">18m 27s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1424/atualizando-um-contato">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Atualizando um contato</span>
                            <span class="c-course-curriculum__lesson-duration">26m 17s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1425/removendo-contatos">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Removendo contatos</span>
                            <span class="c-course-curriculum__lesson-duration">10m 41s</span>
                        </a>
                    </li>
                    <li class="c-course-curriculum__lesson c-course-curriculum__lesson--completed ">
                        <a class="c-course-curriculum__lesson-container" href="/aulas/1426/conclusao-e-proximos-passos">
                            <span class="c-course-curriculum__status"></span>
                            <span class="c-course-curriculum__lesson-name">Conclusão e próximos passos</span>
                            <span class="c-course-curriculum__lesson-duration">6m 39s</span>
                        </a>
                    </li>
                </ol>
            </li>
        </ol>
    </body>

</html>

                    </div>

                    <div class="c-accordion__pane" id="tab-forum">
                        <!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <link rel="stylesheet" href="/dist/css/vendors/nprogress/styles/nprogress-9dc52b7dd289312c1437a3e66ca7662c.css">
    <title>AlgaWorks - Suporte</title>
</head>
<body>
    <div >
        <div class="c-alert  c-alert--info">Você não possui licença de suporte ativa para este curso, mas pode consultar as perguntas realizadas.</div>
    </div>

    <div class="c-predicate-container js-predicates-list">
        <span class="c-predicate-container__item  c-predicate-container__item--default  js-predicate-item-default">
            <span class="c-predicate-container__item-content">
                Todas as perguntas
            </span>
        </span>

        <div class="c-dropdown js-dropdown">
            <a href="javascript:void(0)" class="c-dropdown__filter-link js-filter-dialog-link">Adicionar filtro</a>

            <div class="c-dropdown__popup js-filter-dialog" tabindex="-1">
                <ul class="c-dropdown__menu-list">
                    <li class="c-dropdown__menu-list__item  c-dropdown__menu-list__item--group js-item-group">
                        <a class="c-dropdown__menu-list__content" href="javascript:void(0)">Quando foi enviada</a>

                        <ul class="c-dropdown__menu-list__sub-list">
                            <li class="c-dropdown__menu-list__sub-item">
                                <a data-filter-value="pergunta-hoje"
                                   data-filter-title="Pergunta feita hoje"
                                   class="c-dropdown__menu-list__content js-filter-value"
                                   href="javascript:void(0)">Hoje</a>
                            </li>

                            <li class="c-dropdown__menu-list__sub-item">
                                <a data-filter-value="pergunta-ontem"
                                   data-filter-title="Pergunta feita ontem"
                                   class="c-dropdown__menu-list__content js-filter-value" href="javascript:void(0)">Ontem</a>
                            </li>

                            <li class="c-dropdown__menu-list__sub-item">
                                <a data-filter-value="pergunta-ultimos-7-dias"
                                   data-filter-title="Pergunta feita nos últimos 7 dias"
                                   class="c-dropdown__menu-list__content js-filter-value" href="javascript:void(0)">Últimos 7 dias</a>
                            </li>
                        </ul>
                    </li>

                    <li class="c-dropdown__menu-list__item  c-dropdown__menu-list__item--group js-item-group">
                        <a class="c-dropdown__menu-list__content" href="javascript:void(0)">Perguntas que eu acompanho</a>

                        <ul class="c-dropdown__menu-list__sub-list">
                            <li class="c-dropdown__menu-list__sub-item">
                                <a data-filter-value="respondida-por-mim"
                                   data-filter-title="Respondida por mim"
                                   class="c-dropdown__menu-list__content js-filter-value" href="javascript:void(0)">Respondida por mim</a>
                            </li>

                            <li class="c-dropdown__menu-list__sub-item">
                                <a data-filter-value="enviada-por-mim"
                                   data-filter-title="Enviada por mim"
                                   class="c-dropdown__menu-list__content js-filter-value" href="javascript:void(0)">Enviada por mim</a>
                            </li>
                        </ul>
                    </li>

                    <li class="c-dropdown__menu-list__item  c-dropdown__menu-list__item--group js-item-group">
                        <a class="c-dropdown__menu-list__content" href="javascript:void(0)">Quando houve a última interação</a>

                        <ul class="c-dropdown__menu-list__sub-list">
                            <li class="c-dropdown__menu-list__sub-item">
                                <a data-filter-value="ultima-interacao-hoje"
                                   data-filter-title="Última interação hoje"
                                   class="c-dropdown__menu-list__content js-filter-value"
                                   href="javascript:void(0)">Hoje</a>
                            </li>

                            <li class="c-dropdown__menu-list__sub-item">
                                <a data-filter-value="ultima-interacao-ontem"
                                   data-filter-title="Última interação ontem"
                                   class="c-dropdown__menu-list__content js-filter-value" href="javascript:void(0)">Ontem</a>
                            </li>

                            <li class="c-dropdown__menu-list__sub-item">
                                <a data-filter-value="ultima-interacao-7-dias"
                                   data-filter-title="Última interação há 7 dias"
                                   class="c-dropdown__menu-list__content js-filter-value" href="javascript:void(0)">Últimos
                                    7 dias</a>
                            </li>
                        </ul>
                    </li>

                    <li class="c-dropdown__menu-list__item  c-dropdown__menu-list__item--group js-item-group">
                        <a class="c-dropdown__menu-list__content" href="javascript:void(0)">Qual é a situação atual</a>

                        <ul class="c-dropdown__menu-list__sub-list">
                            <li class="c-dropdown__menu-list__sub-item">
                                <a data-filter-value="resolvida"
                                   data-filter-title="Pergunta resolvida"
                                   class="c-dropdown__menu-list__content js-filter-value" href="javascript:void(0)">Resolvida</a>
                            </li>

                            <li class="c-dropdown__menu-list__sub-item">
                                <a data-filter-value="aberta" class="c-dropdown__menu-list__content js-filter-value"
                                   data-filter-title="Pergunta não resovida"
                                   href="javascript:void(0)">Aberta</a>
                            </li>
                        </ul>
                    </li>

                    

                    
                </ul>
            </div>
        </div>
    </div>

    <div class="c-forum-questions  c-forum-questions--larger js-forum-questions-list"></div>
</body>
</html>

                    </div>
                </div>
            </div>
        </div>
    </div>


	<footer class="l-footer" itemscope="itemscope" itemtype="http://schema.org/EducationalOrganization">
		<div class="l-footer__container">
			
			<div class="l-footer__columns">
			
				<div class="l-footer__company-column">
					<span class="l-footer__column-title" itemprop="name">AlgaWorks</span>
					
					<ul class="l-footer__menu-list">
						<li class="l-footer__menu-item">
							<a href="https://www.algaworks.com/sobre-nos">Sobre nós</a>
						</li>
						<li class="l-footer__menu-item">
							<a href="http://blog.algaworks.com" target="_blank">Nosso blog</a>
						</li>
						<li class="l-footer__menu-item">
							<a href="https://algaworks.recruiterbox.com/" target="_blank" rel="external">Trabalhe com a gente</a>
						</li>
					</ul>
				</div>
				
				<div class="l-footer__social-column">
					<span class="l-footer__column-title">Fique conectado</span>
					
					<ul class="l-footer__social-list">
						<li class="l-footer__social-media  l-footer__social-media--facebook"><a href="https://www.facebook.com/algaworks" target="_blank" title="Siga a gente no Facebook"></a></li>
                        <li class="l-footer__social-media  l-footer__social-media--instagram"><a href="https://www.instagram.com/alga.works/" target="_blank" title="Siga a gente no Instagram"></a></li>
						<li class="l-footer__social-media  l-footer__social-media--youtube"><a href="https://www.youtube.com/subscription_center?add_user=algaworks" target="_blank" title="Assine nosso canal do YouTube"></a></li>
						<li class="l-footer__social-media  l-footer__social-media--linkedin"><a href="https://www.linkedin.com/company/algaworks" target="_blank" title="Siga a gente no LinkedIn"></a></li>
						<li class="l-footer__social-media  l-footer__social-media--twitter"><a href="https://twitter.com/algaworks" target="_blank" title="Siga a gente no Twitter"></a></li>
					</ul>
				</div>
			
				<div class="l-footer__contact-column">
					<ul class="l-footer__contact-list">

                        <li class="l-footer__contact-item  l-footer__contact-item--whatsapp">
                            <a href="https://wa.me/5534996890006" target="_blank">(34) 99689-0006</a>
                        </li>
						<li class="l-footer__contact-item  l-footer__contact-item--email">
                            <a href="mailto:contato@algaworks.com" itemprop="email">contato@algaworks.com</a>
                        </li>
					</ul>
				</div>
			
			</div>
			
			<div class="l-footer__legal">
				<span itemprop="legalName">AlgaWorks Ltda</span><br/>
				CNPJ: <span itemprop="taxID">10.687.566/0001-97</span>
			</div>
			
			<div class="l-footer__copyright">
				© 2017 AlgaWorks. Todos os direitos reservados. Leia nossa
                <a href="https://www.algaworks.com/privacidade" target="_blank">Política de privacidade</a>
                e <a href="https://www.algaworks.com/termos" target="_blank">Termos de uso</a>.
			</div>
		</div>
	</footer>

    <script src="/dist/javascripts/vendors/jquery.min-e071abda8fe61194711cfc2ab99fe104.js"></script>
    <script src="/dist/javascripts/vendors/jquery.mask.min-cc290e6c3aeecf5021dd82ad8df2512a.js"></script>

    <script src='/dist/javascripts/aw.min-5effe06a46e2525715042fb7b263c858.js'></script>


    

    

    <script src="/dist/javascripts/vendors/highlight.pack.min-b783f3d2db0d817811dfbb75084efc8f.js"></script>
    <script src="/dist/javascripts/vendors/player.min-ecac4cc179de6d82cc3a6148f8778ab4.js"></script>
    <script src="/dist/javascripts/vendors/sweetalert2.all.min-3bb7c2ebac19577088c2c5a5a32fe8c7.js"></script>
    <script src="/dist/javascripts/vendors/linkify.min-6e8f00aab46678c5f157427b39fe8091.js"></script>
    <script src="/dist/javascripts/vendors/linkify-jquery.min-22cf4f1c27bfe2adea1fa2f936d62038.js"></script>
    <script src="/dist/javascripts/vendors/moment.min-6c0a2330b0d8d6ea185d4669a0eddeab.js"></script>
    <script src="/dist/javascripts/vendors/nprogress-5fc208df77427b19a1558ee3c2e2d344.js"></script>
    <script src='/dist/javascripts/aw-courses.min-fcc9b4fb7123f0a1183f9409f6346c55.js'></script>


    
        <script>
            var flagLessonAsCompleted = function() {
                var csrfToken = $("[name='_csrf']").val();
                var completedUrl = [location.protocol, '//', location.host, location.pathname, "/completion"].join('');
                $.ajax({
                    contentType : "application/json",
                    dataType : 'json',
                    url:  completedUrl,
                    type: "POST",
                    beforeSend: function(xhr) {
                        xhr.setRequestHeader("X-CSRF-TOKEN", csrfToken);
                    },
                    statusCode: {
                        200: function() {
                          $(".c-course-curriculum__lesson--current").addClass("c-course-curriculum__lesson--completed");
                          $(".js-lesson-not-completed").remove();
                          $(".js-lesson-completed").removeClass("sr-only");
                          var date = new Date();
                          var month = (1 + date.getMonth()).toString();
                          month = month.length > 1 ? month : '0' + month;
                          var dateStr = date.getDate() + "/" + month + "/" + date.getFullYear()
                          $(".js-lesson-completed").text("Aula concluída em " + dateStr);
                        }
                     }
                });
            }

            var tag = document.createElement('script');
            tag.id = 'iframe-demo';
            tag.src = 'https://www.youtube.com/iframe_api';

            var firstScriptTag = document.getElementsByTagName('script')[0];
            firstScriptTag.parentNode.insertBefore(tag, firstScriptTag);

            var player;

            function onPlayerStateChange(event) {
                var playerStatus = event.data;
                if (playerStatus == 0) {
                    flagLessonAsCompleted();
                }
            }

            function onYouTubeIframeAPIReady() {
                player = new YT.Player('video-iframe', {
                     events: {
                       'onStateChange': onPlayerStateChange
                     }
                  });
            }
        </script>
    



    <!-- Infusionsoft Tracking Code -->
<script type="text/javascript" src="https://xb222.infusionsoft.com/app/webTracking/getTrackingCode"></script>



<!-- Popup Domination -->
<script src='https://cdn1.pdmntn.com/a/BkU2IOWcm.js'></script>

<!-- Pingdom -->
<script src="//rum-static.pingdom.net/pa-5c40a057cea07b001600085e.js" async></script>

<!-- Linkedin Rmkt -->
<script type="text/javascript">
_linkedin_partner_id = "290401";
window._linkedin_data_partner_ids = window._linkedin_data_partner_ids || [];
window._linkedin_data_partner_ids.push(_linkedin_partner_id);
</script><script type="text/javascript">
(function(){var s = document.getElementsByTagName("script")[0];
var b = document.createElement("script");
b.type = "text/javascript";b.async = true;
b.src = "https://snap.licdn.com/li.lms-analytics/insight.min.js";
s.parentNode.insertBefore(b, s);})();
</script>
<noscript>
<img height="1" width="1" style="display:none;" alt="" src="https://dc.ads.linkedin.com/collect/?pid=290401&fmt=gif" />
</noscript>

<!-- begin whatsapp code -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
<a id="whatsapp-bubble" href="https://wa.me/5534999955046?text" Style=" position:fixed;width:60px;height:60px;bottom:40px;right:40px;background-color:#25d366;color:#FFF;border-radius:50px;text-align:center;font-size:30px;box-shadow: 1px 1px 2px #888;
z-index:1000;" target="_blank">
<i style="margin-top:16px" class="fa fa-whatsapp"></i>
</a>
<script>
var path = window.location.pathname;
if (path.startsWith("/certs/") || path.startsWith("/meus-cursos/") || path.startsWith("/aulas/") || path.startsWith("/forum/") ){
  document.getElementById("whatsapp-bubble").style.display = 'none';
}
else {
   document.getElementById("whatsapp-bubble").style.display = 'block';
}
</script>
<!-- end whatsapp code -->
</body>
</html>

