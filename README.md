# Parcel E-Commerce Platform

Base monorepo providing backend, frontend and AWS infrastructure to build an e-commerce specialized in selling land parcels.

## Backend
- **Spring Boot** (Maven) following a hexagonal approach.
- Exposes REST API for parcel management.
- Example properties configured for PostgreSQL.

## Frontend
- **React** + **Vite** with **TypeScript**.
- **Tailwind CSS** and **Ant Design** for UI components.

## Infrastructure
- Terraform scripts under `infrastructure/aws` to provision S3 and RDS instances.

This repository only contains the starting point for further development.
