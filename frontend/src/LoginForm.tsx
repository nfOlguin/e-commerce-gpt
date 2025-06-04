import React from 'react';
import { Form, Input, Button } from 'antd';

interface LoginFormProps {
  onLogin: (username: string, password: string) => void;
}

const LoginForm: React.FC<LoginFormProps> = ({ onLogin }) => {
  const onFinish = (values: any) => {
    onLogin(values.username, values.password);
  };

  return (
    <div className="min-h-screen flex items-center justify-center bg-gray-50">
      <Form
        name="login"
        onFinish={onFinish}
        className="p-6 bg-white shadow-md rounded w-80"
      >
        <Form.Item
          name="username"
          rules={[{ required: true, message: 'Please input your username!' }]}
        >
          <Input placeholder="Username" />
        </Form.Item>
        <Form.Item
          name="password"
          rules={[{ required: true, message: 'Please input your password!' }]}
        >
          <Input.Password placeholder="Password" />
        </Form.Item>
        <Form.Item>
          <Button type="primary" htmlType="submit" className="w-full">
            Log in
          </Button>
        </Form.Item>
      </Form>
    </div>
  );
};

export default LoginForm;
