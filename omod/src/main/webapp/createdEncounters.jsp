<%@ include file="/WEB-INF/template/include.jsp"%>
<%@ include file="/WEB-INF/template/header.jsp"%>

<%@ include file="template/localHeader.jsp"%>

        <head>
        <script type="text/javascript" src="https://www.google.com/jsapi"></script>
        <script type="text/javascript">

        // Drawing the used memory graph using the google chart API
        google.load("visualization", "1", {packages:["corechart"]});
        google.setOnLoadCallback(drawChart);

        function drawChart() {

        var text= "${formCounts}";   // this list contains the Date and Memory Usage data from the model
        var timeAndEncCountArray = eval("[" + text + "]");
        var dataTable = new google.visualization.DataTable();
        dataTable.addColumn('datetime', 'Time');          // the format 'datetime' only accepts Date objects
        dataTable.addColumn('number', 'Encounters Count');
        dataTable.addRows(timeAndEncCountArray);

        var options = {
        title:'Per hour',
        chartArea : { left :150 },
        hAxis: { title: 'Time' },
        vAxis: { title: 'Encounters Count' }
        };

        var chart = new google.visualization.LineChart(document.getElementById('form_div'));
        chart.draw(dataTable, options);
        }
        </script>

        </head>

        <body>
        <div id="perHourEncountersChart">
        <b class="boxHeader"> Created Encounters against Date-Time  </b>
        <div class="box">
        <div id="form_div" style="height:400px"></div>
        </div>
        </div>
        </body>

<%@ include file="/WEB-INF/template/footer.jsp"%>