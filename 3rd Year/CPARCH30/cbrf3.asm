.model small
.stack
.data
    strinput db "INPUT CHOICE:", 13, 10 , "1: BLUE", 13, 10 , "2: GREEN", 13, 10, "3: RED", 13, 10 , "e: exit$"
.code

cbrf:
mov ax, @data
mov ds, ax

mov ax, 0600h           ;clearscreen
mov bh, 07h 
mov cx, 0000h
mov dx, 184fh
int 10h

mov bh, 07h             ;setvidmode
mov cx, 0000h
mov dh, 100
mov dl, 100
int 10h

jmp menuloop            ;skip to menuloop first

st1:
mov ax, 0600h           ;clearscreen
mov bh, 07h 
mov cx, 0000h
mov dx, 184fh
int 10h

mov bh, 17h             ;color
mov cx, 0000h
mov dh, 100
mov dl, 100
int 10h

mov ah, 02h             ;cursorloc
mov bh, 00h
mov dh, 0
mov dl, 14
int 10h

mov ah, 02h
mov dl, '1'
int 21h

jmp menuloop

st2:
mov ax, 0600h           ;clearscreen
mov bh, 07h 
mov cx, 0000h
mov dx, 184fh
int 10h

mov bh, 20h             ;color
mov cx, 0000h
mov dh, 100
mov dl, 100
int 10h

mov ah, 02h             ;cursorloc
mov bh, 00h
mov dh, 0
mov dl, 14
int 10h

mov ah, 02h
mov dl, '2'
int 21h

jmp menuloop

mov cx, 1000
menuloop:
    mov ah, 02h             ;cursorloc
    mov bh, 00h
    mov dh, 0
    mov dl, 0
    int 10h

    mov ah, 09h
    mov dx, offset strinput
    int 21h

    mov ah, 02h             ;cursorloc for the text input
    mov bh, 00h
    mov dh, 0
    mov dl, 14
    int 10h
    
    mov ah, 01h
    int 21h
    
    cmp al, '1'
    je st1
    cmp al, '2'
    je st2
    cmp al, '3'
    je st3
    cmp al, 'x'
    je exit
    loop menuloop
    
st3:
mov ax, 0600h           ;clearscreen
mov bh, 07h 
mov cx, 0000h
mov dx, 184fh
int 10h

mov bh, 47h             ;color
mov cx, 0000h
mov dh, 100
mov dl, 100
int 10h

mov ah, 02h             ;cursorloc
mov bh, 00h
mov dh, 0
mov dl, 14
int 10h

mov ah, 02h
mov dl, '3'
int 21h

jmp menuloop
    
exit:
mov ah, 02h             ;cursorloc
mov bh, 00h
mov dh, 10
mov dl, 0
int 10h

mov ah, 4ch
int 21h
end cbrf