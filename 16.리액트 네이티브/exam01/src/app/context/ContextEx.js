'use client';
import ContextEx2 from './ContextEx2';
import { UserProvider } from './Usercontext';

const ContextEx = () => {
  return (
    <UserProvider>
      <ContextEx2 />
    </UserProvider>
  );
};

export default ContextEx;