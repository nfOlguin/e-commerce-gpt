import { Module } from '@nestjs/common';
import { PrismaModule } from './config/prisma.module';
import { AuthModule } from './modules/auth/auth.module';
import { ListingsModule } from './modules/listings/listings.module';
import { UnitsModule } from './modules/units/units.module';

@Module({
  imports: [PrismaModule, AuthModule, ListingsModule, UnitsModule],
})
export class AppModule {}
