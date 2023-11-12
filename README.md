# ReportService

## RabbitMQ

### Add Report
`Queues: AddReportQueue`
>
`Exchanges: ReportExchange`
>
`routingkey: addReport`

### Get Report
`Queues: GetReportQueue`
>
`Exchanges: ReportExchange`
>
`routingkey: getReport`

### Path
`AddReport (POST) : http://localhost:8082/report-service/addReport/{type}/{reportTargetId}`
