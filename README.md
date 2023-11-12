# ReportService

## RabbitMQ

### Add Report
`Queues: AddReportQueue`
>
`Exchanges: ReportExchange`
>
`routingkey: addReport`

### Path
`AddReport (POST) : http://localhost:8082/report-service/addReport/{type}/{reportTargetId}`
