import React from 'react';
import { Form, Input, InputNumber, Button, Select } from 'antd';
import { ParcelStatus } from './types';

interface Props {
  onCreated: () => void;
}

const { Option } = Select;

const NewParcelForm: React.FC<Props> = ({ onCreated }) => {
  const onFinish = async (values: any) => {
    await fetch('/api/parcels', {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify({
        name: 'Parcel',
        price: 0,
        location: values.location,
        size: values.size,
        status: values.status,
        ownerInfo: values.ownerInfo,
        extras: values.extras,
        shape: null,
      }),
    });
    onCreated();
  };

  return (
    <Form onFinish={onFinish} layout="vertical" className="max-w-md">
      <Form.Item name="location" label="Ubicaci\u00f3n" rules={[{ required: true }]}> 
        <Input />
      </Form.Item>
      <Form.Item name="size" label="Metros cuadrados" rules={[{ required: true }]}> 
        <InputNumber className="w-full" />
      </Form.Item>
      <Form.Item name="ownerInfo" label="Informaci\u00f3n propietario" rules={[{ required: true }]}> 
        <Input />
      </Form.Item>
      <Form.Item name="status" label="Estado" rules={[{ required: true }]}> 
        <Select>
          <Option value="AVAILABLE">Disponible</Option>
          <Option value="RESERVED">Reservada</Option>
          <Option value="SOLD">Vendida</Option>
        </Select>
      </Form.Item>
      <Form.Item name="extras" label="Agregados"> 
        <Input.TextArea rows={4} />
      </Form.Item>
      <Form.Item>
        <Button type="primary" htmlType="submit">Guardar</Button>
      </Form.Item>
    </Form>
  );
};

export default NewParcelForm;
