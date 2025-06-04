provider "aws" {
  region = var.region
}

resource "aws_s3_bucket" "static" {
  bucket = var.bucket_name
}

resource "aws_db_instance" "rds" {
  allocated_storage    = 20
  engine               = "postgres"
  instance_class       = "db.t3.micro"
  name                 = "parceldb"
  username             = var.db_username
  password             = var.db_password
  skip_final_snapshot  = true
}
