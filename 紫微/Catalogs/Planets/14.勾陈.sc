// Object HD 216446  ---  High Proper Motion Star  ---  OID=@290451   (@@5546,3)  ---  coobox=1005 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Infra-Red Source 
Star "HD 216446 A"
{
	DateUpdated     "2024-04-29"
	ParentBody      "HD 216446"
	Class           "K3III"
	AbsMagn         -0.14
	MassKg          7.46860282569272e+30 // log(g) = 2.21 cm/s^2
	RadSol          25.2
	LumBol          193
	Teff            4288
	FeH             -0.10

	BinaryOrbit     
	{
		Epoch           2448623
		Separation      378.461616797492 // 3.91 asec
		PositionAngle   38
	}
}

// Object HD 216446B  ---  High Proper Motion Star  ---  OID=@15324534   (@@-1,255)  ---  coobox=1005 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "HD 216446 B"
{
	DateUpdated     "2024-04-29"
	ParentBody      "HD 216446"
	Class           "K3?"
}

// Object * lam UMi  ---  Long-Period Variable  ---  OID=@330650   (@@5248,5)  ---  coobox=1706 
// Object types: Long-Period Variable,Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source 
// Gaia DR3显示B的视差仅0.5495，远小于主星，故此处认为其为背景恒星。
Remove "LAM UMi A" {ParentBody "LAM UMi"}
Remove "LAM UMi B" {ParentBody "LAM UMi"}
