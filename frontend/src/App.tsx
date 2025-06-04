import React, { useState } from 'react';
import { message } from 'antd';
import LoginForm from './LoginForm';
import NewParcelForm from './NewParcelForm';

const App: React.FC = () => {
  const [credentials, setCredentials] = useState<{ username: string; password: string } | null>(null);
  const [created, setCreated] = useState(false);

  const handleLogin = (username: string, password: string) => {
    setCredentials({ username, password });
  };

  if (!credentials) {
    return <LoginForm onLogin={handleLogin} />;
  }

  return (
    <div className="p-4">
      <h1 className="text-2xl font-bold mb-4">Panel de Vendedor</h1>
      {created && <div className="mb-2 text-green-600">\u00a1Publicaci\u00f3n creada!</div>}
      <NewParcelForm onCreated={() => { setCreated(true); message.success('Guardado'); }} />
    </div>
  );
};

export default App;
