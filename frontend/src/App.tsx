import React, { useState } from 'react';
import { Button } from 'antd';
import LoginForm from './LoginForm';

const App: React.FC = () => {
  const [credentials, setCredentials] = useState<{ username: string; password: string } | null>(null);

  const handleLogin = (username: string, password: string) => {
    setCredentials({ username, password });
  };

  if (!credentials) {
    return <LoginForm onLogin={handleLogin} />;
  }

  return (
    <div className="p-4">
      <h1 className="text-2xl font-bold mb-4">Parcel E-Commerce</h1>
      <Button type="primary">Explore Parcels</Button>
    </div>
  );
};

export default App;
