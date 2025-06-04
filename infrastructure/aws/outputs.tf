output "bucket_name" {
  value = aws_s3_bucket.static.bucket
}

output "rds_endpoint" {
  value = aws_db_instance.rds.endpoint
}
