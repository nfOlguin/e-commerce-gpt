# Parcel E-Commerce Platform

Base monorepo providing backend, frontend and AWS infrastructure to build an e-commerce specialized in selling land parcels.

## Backend
- **Spring Boot** (Maven) following a hexagonal approach.
- Exposes REST API for parcel management.
- Example properties configured for PostgreSQL.
- Parcels now include a `shape` field storing the polygon in WKT format.

## Frontend
- **React** + **Vite** with **TypeScript**.
- **Tailwind CSS** and **Ant Design** for UI components.
  
### Login
The frontend now includes a minimalist login page using Ant Design. Use the `holding`/`password` credentials to access privileged actions.

## Infrastructure
- Terraform scripts under `infrastructure/aws` to provision S3 and RDS instances.

This repository only contains the starting point for further development.

## Authentication
- Basic HTTP authentication using Spring Security.
- Profile **HOLDING_USER** can log in with username `holding` and password `password`.
- Guests can access read-only endpoints without logging in.
- Support for an **EXECUTIVE** role will be added later.
