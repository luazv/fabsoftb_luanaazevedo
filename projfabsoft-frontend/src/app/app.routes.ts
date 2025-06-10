import { Routes } from '@angular/router';
import { UsuarioComponent } from './usuario/usuario.component';
import { FormUsuarioComponent } from '@angular/forms';

export const routes: Routes = [
    {path: 'usuarios', component: UsuarioComponent}
    {path: 'usuarios/novo', component: FormuUsuarioComponent}
];
