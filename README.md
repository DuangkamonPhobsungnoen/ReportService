# ReportService

## RabbitMQ

### Add Report
`Queues: AddReportQueue`
>
`Exchanges: ReportExchange`
>
`routingkey: addReport`

### Get Report
`Queues: GetBookQueue`
>
`Exchanges: ReportExchange`
>
`routingkey: getReport`

### Path
`AddReport (POST) : http://localhost:8082/report-service/addReport/{type}/{reportTargetId}`
