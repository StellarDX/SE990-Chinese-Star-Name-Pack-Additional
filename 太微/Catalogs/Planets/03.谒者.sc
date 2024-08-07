// Object * 17 Vir  ---  High Proper Motion Star  ---  OID=@1939358   (@@39626,7)  ---  coobox=14000 
// Object types: Near-IR Source (λ < 3 µm),High Proper Motion Star,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "17 Vir A" {ParentBody "17 Vir"}
Remove "17 Vir B" {ParentBody "17 Vir"}
Star "17 Vir A"
{
	DateUpdated     "2024-05-05"
	ParentBody      "HIP 60353"
	Class           "F8V"
	AbsMagn         4.08 // 计算的值
	MassKg          1.86157654443368e+30 // log(g) = 4.203 cm/s^2
	RadSol          1.268298 // Gaia DR3
	LumBol          1.92750898831205 // 计算的值
	Teff            6039
	FeH             -0.286

	BinaryOrbit     
	{
		Separation      625.356166026778 // 20.85 asec
	}
}

// Object * 17 Vir B  ---  High Proper Motion Star  ---  OID=@1939359   (@@39626,8)  ---  coobox=14000 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,High Proper Motion Star,Star 
Star "17 Vir B/HIP 60352/Gaia DR3 3900151916215125760/TIC 377227655/LSPM J1222+0518N/ASCC 1043518/2MASS J12223149+0518389/USNO-B1.0 0953-00211412/ADS 8531 B/AG+05 1723/BD+06 2599B/CCDM J12225+0518B/CSI+06 2599 2/GCRV 7427/GEN# +1.00107705B/GSC 00288-01148/HIC 60352/IDS 12174+0552 B/PPM 158772/TYC 288-1148-1/UBV 11116/Pul -3 940223/WDS J12225+0518B/** STF 1636B/WISEA J122231.40+051837.8/WEB 10736/Gaia DR2 3900151916215125760"
{
	DateUpdated     "2024-05-05"
	ParentBody      "HIP 60353"
	Parallax        33.3729
	Class           "K5V:"
}